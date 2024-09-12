package filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import connection.SingleConnectionBanco;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/principal/*"})
public class FilterAutenticacao extends HttpFilter implements Filter {
	
	private static Connection connection;
	
       
    public FilterAutenticacao() {
        super();
    }

    //Encerra o processo quando o servidor é parado
	public void destroy() {
		try {
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	// Intercepta as requisições e as respostas no sistema
	// Tudo que fizer no sistema vai passar por aqui
	// Validação de autenticação
	// Dar commit e rollback de transações do banco
	// Valida e faz o redirecionamento das paginas
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		try {
			HttpServletRequest req = (HttpServletRequest) request;
			HttpSession session = req.getSession();
			
			String usuarioLogado = (String) session.getAttribute("usuario");
			
			String urlParaAutenticar = req.getServletPath();// URL que esta sendo acessada
			
			if (usuarioLogado == null || (usuarioLogado != null && usuarioLogado.isEmpty()) && 
				!urlParaAutenticar.contains("ServletLogin")) { // usuário não esta logado
				
				RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp?url="
						+ urlParaAutenticar);
				request.setAttribute("msg", "Realize o Login por favor");
				redirecionar.forward(request, response);
				return; // Para a execução e redireciona para o Login
				
			} else {
				chain.doFilter(request, response);
				
			}
			
			connection.commit();
		
		}catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher redirecionar = request.getRequestDispatcher("erro.jsp");
			request.setAttribute("msg", e.getMessage());
			redirecionar.forward(request, response);
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
				
			}
		}
		
	}

	// Inicia os processos ou recursos quando o servidor sobe o projeto
	// Inicia conexão com o banco
	// 
	public void init(FilterConfig fConfig) throws ServletException {
		connection = SingleConnectionBanco.getConnection();
		
	}

}

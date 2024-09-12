package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionBanco {

	private static String banco = "jdbc:postgresql://localhost:5433/curso-jsp?autoReconnect=true";
	private static String user = "postgres";
	private static String senha = "admin";
	private static Connection connection = null;
	
	
	public static Connection getConnection() {// Retorna a conexão existente
		return connection;
	}
	
	static { // se essa classe for chamada diretamente ele garante que o metodo conectar vai ser chamado 
		conectar();
	}
	
	public SingleConnectionBanco() { // Quando tiver uma Instancia vai conectar
		conectar();
	}
	
	private static void conectar() {
		try {
			
			if (connection == null) {
				Class.forName("org.postgresql.Driver"); //Carrega o driver JDBC do PostgreSQ
				connection = DriverManager.getConnection(banco, user, senha); //Cria a conexão com as credenciais e URL fornecidas.
				connection.setAutoCommit(false); //Desativa o auto-commit, permitindo controle manual das transações.
				System.out.println("Conectou com Sucesso");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

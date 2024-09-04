package conexaojdbcsimples;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionSimples {

	
	private static String url = "jdbc:postgresql://localhost:5433/posjava";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null;
	
		
	public static void conectar() {
		try {
			
			if (connection == null) {
				Class.forName("org.postgresql.Driver"); //Carrega o driver JDBC do PostgreSQ
				connection = DriverManager.getConnection(url, user, password); //Cria a conexão com as credenciais e URL fornecidas.
				connection.setAutoCommit(false); //Desativa o auto-commit, permitindo controle manual das transações.
				System.out.println("Conectou Simples com Sucesso");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}

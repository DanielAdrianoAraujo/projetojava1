package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

	private static String url = "jdbc:postgresql://localhost:5433/posjava";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null;
	
	//Este bloco é executado uma única vez quando a classe é 
	//carregada pela primeira vez na JVM (Java Virtual Machine).
	//Chama o método conectar() para estabelecer a conexão.
	static {
		conectar();
	}
	
	//Este construtor é chamado quando um objeto da classe SingleConnection é criado.
	//Embora não seja necessário chamar conectar() aqui por causa do bloco estático, 
	// ele garante que a conexão seja inicializada se for chamada explicitamente.
	public SingleConnection() {
		conectar();
	}
	
	
	private static void conectar() {
		try {
			
			if (connection == null) {
				Class.forName("org.postgresql.Driver"); //Carrega o driver JDBC do PostgreSQ
				connection = DriverManager.getConnection(url, user, password); //Cria a conexão com as credenciais e URL fornecidas.
				connection.setAutoCommit(false); //Desativa o auto-commit, permitindo controle manual das transações.
				System.out.println("Conectou com Sucesso");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	
	
}

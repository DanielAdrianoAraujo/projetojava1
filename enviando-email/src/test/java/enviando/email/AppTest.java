package enviando.email;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@org.junit.Test
    public void testeEmail() throws Exception{
		
		
		ObjetoEnviaEmail enviaEmail = 
				new ObjetoEnviaEmail("danfreeflyer@yahoo.com.br", 
				                     "Daniel Araujo", 
				                     "Novo Trabalho com Java", 
				                     "Criando email no Java com parametros");
		
		enviaEmail.enviarEmail();
	
		
		Thread.sleep(10000);
    	
    }
	
}

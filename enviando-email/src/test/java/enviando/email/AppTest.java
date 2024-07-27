package enviando.email;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@org.junit.Test
    public void testeEmail() throws Exception{
		
		// StringBuilder é uma classe usada para criar e manipular sequências de caracteres de forma eficiente e dinâmica
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		//---------------------Append é um método usado para acrescentar
		stringBuilderTextoEmail.append("E ai, <br/><br/>" );
		stringBuilderTextoEmail.append("<h2>Email do teste Java<h2/><br/><br/>");
		stringBuilderTextoEmail.append("Clique no Botão<br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://www.uol.com.br/\" style= \"color:#2525a7; padding: 14px 25px; text-align:center; text-decaration: none; display:inline-block; border-radius:30px; font-size:20px; font-family:courier; border : 3px solid green; background-color:#99DA39;\">Acessar UoL</a>");
		
		ObjetoEnviaEmail enviaEmail = 
				new ObjetoEnviaEmail("danfreeflyer@yahoo.com.br", 
				                     "Daniel Araujo", 
				                     "Java dia 26/07", 
				                     stringBuilderTextoEmail.toString());
		
		enviaEmail.enviarEmail(true);
				   		
		Thread.sleep(10000);
    	
    }
	
}

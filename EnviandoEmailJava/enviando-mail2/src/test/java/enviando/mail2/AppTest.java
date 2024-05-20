package enviando.mail2;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private String userName = "testejavamaven@gmail.com";
	private String senha = "yoif urgv rwzl hitr";
	//private String senha = "Danfreeflyer";

	@org.junit.Test
	public void testeEmail () {
	
		try {
		Properties properties = new Properties(); 
		
		properties.put("mail.smtp.ssl.trust", "*"); // Autentica com o SSL
		properties.put("mail.smtp.auth", "true"); // Autorização 
		properties.put("mail.smtp.starttls", "true"); // Autenticação  
		properties.put("mail.smtp.host", "smtp.gmail.com");//Servidor
		properties.put("mail.smtp.port", "465"); // Porta do Servidor
		properties.put("mail.smtp.socketFactory", "465"); // Porta a se conectar pelo socket
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // Classe socket de conexão SMTP
		
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, senha);
			}
		
		});
		
		Address[] toUser = InternetAddress.parse("danfreeflyer@yahoo.com.br");
		
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(userName, "Daniel Araujo")); 
		message.setRecipients(Message.RecipientType.TO, toUser);
		message.setSubject("Chegou e-mail enviado Java2");
		message.setText("Olá Pgms");
		
		Transport.send(message);		
		
		Thread.sleep(10000);
		
		System.out.println(senha);
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	



    /* extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   /* public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
  /*  public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
  /*  public void testApp()
    {
        assertTrue( true );
    } */
}

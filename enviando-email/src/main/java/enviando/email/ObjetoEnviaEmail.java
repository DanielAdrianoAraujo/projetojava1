package enviando.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ObjetoEnviaEmail {
	
	private String userName = "testejavamaven@gmail.com";
	private String senha = "yoif urgv rwzl hitr";
	
	private String listaDestinatario = "";
	private String nomeRemetente = "";
	private String assuntoEmail = "";
	private String textoEmail = "";
	  
	 
	public ObjetoEnviaEmail(String listaDestinatario, String nomeRemetente, String assuntoEmali, String textoEmail) {
		this.listaDestinatario = listaDestinatario;
		this.nomeRemetente = nomeRemetente;
		this.assuntoEmail = assuntoEmali;
		this.textoEmail = textoEmail;
		
		}	
	 
		
	public void enviarEmail() throws Exception{
	
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
		
		Address[] toUser = InternetAddress.parse(listaDestinatario);
		
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(userName, nomeRemetente)); 
		message.setRecipients(Message.RecipientType.TO, toUser);
		message.setSubject(assuntoEmail);
		message.setText(textoEmail);
		
		Transport.send(message);
		
		};

}

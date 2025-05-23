package enviando.email;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
public class ObjetoEnviaEmail {
	
	private String userName = "testejavamaven@gmail.com";
	private String senha = "yoif urgv rwzl hitr";
	 
	private String listaDestinatario = "";
	private String nomeRemetente = "";
	private String assuntoEmail = "";
	private String textoEmail = ""; 
	  
	 
	// Construtor que vai receber os parametros e vai link com os campos definidos acima
	public ObjetoEnviaEmail(String listaDestinatario, String nomeRemetente, 
			String assuntoEmali, String textoEmail) {
		this.listaDestinatario = listaDestinatario;
		this.nomeRemetente = nomeRemetente;
		this.assuntoEmail = assuntoEmali;
		this.textoEmail = textoEmail;		
		}	
	 
		
	public void enviarEmail(boolean envioHtml) throws Exception{
	
		//  Properties Classe utilizada para gerenciar arquivos de configuração que trabalham com pares de chave e valor
		Properties properties = new Properties(); 
		
		properties.put("mail.smtp.ssl.trust", "*"); // Autentica com o SSL
		properties.put("mail.smtp.auth", "true"); // Autorização 
		properties.put("mail.smtp.starttls", "true"); // Autenticação  
		properties.put("mail.smtp.host", "smtp.gmail.com");//Servidor gmail Google
		properties.put("mail.smtp.port", "465"); // Porta do Servidor
		properties.put("mail.smtp.socketFactory", "465"); // Porta a se conectar pelo socket
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // Classe socket de conexão SMTP
		
		// Session é um objeto utilizado para armazenar informações sobre o usuário durante a navegação em um site
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
		
		
		if (envioHtml) {
			message.setContent(textoEmail, "text/html; charset=utf-8"); 
		}else {
			message.setText(textoEmail);
		};
		
		
		Transport.send(message);
		
		}
		
	public void enviarEmailAnexo(boolean envioHtml) throws Exception{
		
		//  Properties Classe utilizada para gerenciar arquivos de configuração que trabalham com pares de chave e valor
		Properties properties = new Properties(); 
		
		properties.put("mail.smtp.ssl.trust", "*"); // Autentica com o SSL
		properties.put("mail.smtp.auth", "true"); // Autorização 
		properties.put("mail.smtp.starttls", "true"); // Autenticação  
		properties.put("mail.smtp.host", "smtp.gmail.com");//Servidor gmail Google
		properties.put("mail.smtp.port", "465"); // Porta do Servidor
		properties.put("mail.smtp.socketFactory", "465"); // Porta a se conectar pelo socket
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // Classe socket de conexão SMTP
		
		// Session é um objeto utilizado para armazenar informações sobre o usuário durante a navegação em um site
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
		
		
		// 1º parte do email que é texto e descrição do e-mail
		MimeBodyPart corpoEmail = new MimeBodyPart();
		
		
		if (envioHtml) {
			corpoEmail.setContent(textoEmail, "text/html; charset=utf-8"); 
		}else {
			corpoEmail.setText(textoEmail);
		};
		
		
		List<FileInputStream> arquivos = new ArrayList<FileInputStream>();
		arquivos.add(simuladorDePdf()); // Certificado
		arquivos.add(simuladorDePdf()); // Nota Fiscal
		arquivos.add(simuladorDePdf()); // Documento texto
		arquivos.add(simuladorDePdf()); // Imagem
		arquivos.add(simuladorDePdf()); // DARF
		
		
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(corpoEmail);
		
		
		int index = 1;
		for (FileInputStream fileInputStream : arquivos) {
			
			// 2º parte do email que são os anexo 
			MimeBodyPart anexoEmail = new MimeBodyPart();
			
			// Onde é passado o simuladorDePdf deve ser passado o arquivo gravado no Banco de Dados
			anexoEmail.setDataHandler(new DataHandler(new ByteArrayDataSource(fileInputStream, "application/pdf")));
			anexoEmail.setFileName("anexoemail"+index+".pdf");
						
			multipart.addBodyPart(anexoEmail);
			
			index++;
		} 
		
		message.setContent(multipart);
		
		Transport.send(message);
		
		}
	
	
	
	// Esse método simula o PDF ou qualquer arquivo que possa ser enviado por anexo.
	// Vai retornar um PDF com o texto do Paragrafo
			private FileInputStream simuladorDePdf() throws Exception {
				Document document = new Document();
				File file = new File("fileanexo.pdf");
				file.createNewFile();
				PdfWriter.getInstance(document, new FileOutputStream(file));
				document.open();
				document.add(new Paragraph("Conteudo dentro do PDF"));
				document.close();
				
				return new FileInputStream(file);
			}	

		
	};



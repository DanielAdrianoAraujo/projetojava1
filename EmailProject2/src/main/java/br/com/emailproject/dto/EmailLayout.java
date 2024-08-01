package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {
	
	private static final String QUEBRA_DUPLA = "<br><br>";
	private static final String QUEBRA_UNICA = "<br>";
	
	public Email montarEmailAdministrador(String destinatario, String assunto) {
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Admin")
			.append(QUEBRA_DUPLA);
		texto
			.append("Solicito Alteração de Senha") 
			.append(QUEBRA_DUPLA);

		gerarAssinatura(texto);
		
		gerarRodape(texto);
			
		return new Email(destinatario, assunto, texto.toString());
	}
	
	
	public Email montarEmailSecretario(String destinatario, String assunto) {
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Secretario")
			.append(QUEBRA_DUPLA);
		texto
			.append("Solicito Alteração de Senha - Secretario") 
			.append(QUEBRA_DUPLA);

		gerarAssinatura(texto);
		
		gerarRodape(texto);
			
		return new Email(destinatario, assunto, texto.toString());
	}
	
	
	private String gerarAssinatura(StringBuilder texto) {
		return texto
				.append("Att:")
				.append(QUEBRA_UNICA)
				.append("Diretor")
				.append(QUEBRA_DUPLA)
				.toString();
	}

	private String gerarRodape(StringBuilder texto) {
		return texto.append("Email automatico").toString();
	} 
	

}

package cursojava.interfaces;


/* Essa Interface Sera nosso contrato de autenticação*/
public interface PermitirAcesso {
	
	//public boolean autenticar(); /* Apenas Declaração do Metodo*/
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();

}

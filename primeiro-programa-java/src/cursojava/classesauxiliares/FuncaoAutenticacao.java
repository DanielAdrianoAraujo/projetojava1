package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Somente receber alguem que tenha o contrato de interface de permitir acesso e chamar o autenticado*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitiracesso;
	
	public boolean autenticar() {
		return permitiracesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitiracesso = acesso;
	}
}

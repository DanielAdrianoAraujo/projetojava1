package FolhaPagamento;

import static java.lang.System.out; 

public class Empregado {

	private String nome;
	private String cargo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void preencherCheque(double valorPago) {
		out.printf("Pague em nome de %s ", nome);
		out.printf("(%s) ***$", cargo);
		out.printf("%, .2f\n", valorPago);
				
	}
	
	
}

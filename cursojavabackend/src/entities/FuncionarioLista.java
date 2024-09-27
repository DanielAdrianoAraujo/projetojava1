package entities;

public class FuncionarioLista {

	private int id;
	private String nome;
	private double salario;
	
	public FuncionarioLista() {
	}
	
	public FuncionarioLista(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getsalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentoSalarioFunc(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	
	@Override
	public String toString() {
		return id + "," +  
			   nome + String.format(", %.2f", salario);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

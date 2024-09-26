package entities;

public class Funcionario {

	public String nome;
	public double salario;
	public double taxa;

	public double salarioLiquido() {
		this.salario = 6000.00;
		double salarioLiq = (this.salario - 1000);
		return salarioLiq;
	}

	public void imposto(String aumento) {
		double num = Double.parseDouble(aumento);
		this.salario += (this.salario / 100 * num);
		this.salario += - 1000;
	}

}

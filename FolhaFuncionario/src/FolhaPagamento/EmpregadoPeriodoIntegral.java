package FolhaPagamento;

public class EmpregadoPeriodoIntegral extends Empregado {

	private double salarioMensal;
	private double deducaoBeneficios;
	
	
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public double getDeducaoBeneficios() {
		return deducaoBeneficios;
	}
	public void setDeducaoBeneficios(double deducaoBeneficios) {
		this.deducaoBeneficios = deducaoBeneficios;
	}
	
	public double calcValorPagamento() {
		return salarioMensal - deducaoBeneficios;
	}
	
}

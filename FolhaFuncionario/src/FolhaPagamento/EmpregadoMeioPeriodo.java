package FolhaPagamento;

public class EmpregadoMeioPeriodo extends Empregado {

	private double taxaHora;

	public double getTaxaHora() {
		return taxaHora;
	}

	public void setTaxaHora(double taxaHora) {
		this.taxaHora = taxaHora;
	}
	
	public double calcValorPagamentomp (double horas) {
		return taxaHora * horas;
	}
	
}

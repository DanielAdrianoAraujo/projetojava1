package FolhaPagamento;

public class MeioPeriodoHoraExtraEmDobro extends EmpregadoMeioPeriodo{

	@Override
	public double calcValorPagamento(int horas) {
		if(horas <= 40) {
			return getTaxaHora() * horas;
		} else {
			return getTaxaHora() * 40 + getTaxaHora() * 2 * (horas-40) ;
		}
	}
}

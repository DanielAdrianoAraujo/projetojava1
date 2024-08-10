package FolhaPagamento;

public class FazerFolhaTipoF {
	
	public static void main(String[] args) {

			
		EmpregadoPeriodoIntegral piEmpregado = new EmpregadoPeriodoIntegral();
				
		piEmpregado.setNome("Daniel");
		piEmpregado.setCargo("CEO");
		piEmpregado.setSalarioMensal(1000000.00);
		piEmpregado.setDeducaoBeneficios(50.00);
		piEmpregado.preencherCheque(piEmpregado.calcValorPagamento());
		
		System.out.println();
		
		EmpregadoMeioPeriodo mpEmpregado = new EmpregadoMeioPeriodo();
		
		mpEmpregado.setNome("Adriano");
		mpEmpregado.setCargo("Diretor");
		mpEmpregado.setTaxaHora(1000.00);
		mpEmpregado.preencherCheque(mpEmpregado.calcValorPagamentomp(78));
		
	}

	

}

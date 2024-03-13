package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria banco = new ContaBancaria();
		banco.setDescricao("Conta Daniel");
		System.out.println(banco);
		
		banco.subtrai100Reais();
		System.out.println(banco);
		
		banco.soma100Reais();
		System.out.println(banco);
		
		banco.depositoDinheiro(500);
		System.out.println(banco);
		
		banco.sacarDinheiro(2000);
		System.out.println(banco);
		
		banco.setSaldo(10000);
		System.out.println(banco.getSaldo());

	}

}

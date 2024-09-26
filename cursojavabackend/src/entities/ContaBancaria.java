package entities;

public class ContaBancaria {


	private int conta;
	private String nome;
	private double saldo;
	
		 
	public ContaBancaria(int conta, String nome, double saldoInicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(saldoInicial);
	}


	public ContaBancaria(int conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta " + 
				conta + 
	            ", nome: " + 
				nome + 
				", saldo: R$ " 
				+ String.format("%.2f", saldo);
	}
	
	
	public void deposito(double montante) {
		this.saldo += montante;		
	}
	
	public void retirada(double montante) {
		this.saldo -= montante + 5.0;		
	}
		
		

}

package javabackend;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class MovimentacaoConta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaBancaria contaBancaria;
		
		System.out.print("Entre com numero da conta: " );
		int numero = sc.nextInt();
		
		System.out.print("Entre com nome do cliente: " );
		sc.nextLine();
		String Cliente = sc.nextLine();
		
		System.out.print("Deposito Inicial (S/N)? " );
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'S') {
			System.out.print("Entre com Deposito: " );
			double inicialDeposito = sc.nextDouble();
			contaBancaria = new ContaBancaria(numero, Cliente, inicialDeposito);
		}else {
			contaBancaria = new ContaBancaria(numero, Cliente);
		}
		
		System.out.println();
		System.out.print("Dados da Conta: " );
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Entre com Deposito: " );
		double depositoValor = sc.nextDouble();
		contaBancaria.deposito(depositoValor);
		System.out.print("Conta Atualizada: " );
		System.out.println(contaBancaria);	
		
		System.out.println();
		System.out.print("Entre com Saque: " );
		double saqueValor = sc.nextDouble();
		contaBancaria.retirada(saqueValor);
		System.out.print("Conta Atualizada: " );
		System.out.println(contaBancaria);	
		
		sc.close();
	}
	
}

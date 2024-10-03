package javabackend;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exception.BusinessException;

public class ProcessaSaque {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter account data");
			System.out.println("Number: ");
			Integer num = sc.nextInt();
			System.out.println("Holder: ");
			String nome = sc.next();
			System.out.println("Initial balance: ");
			Double iniBalance = sc.nextDouble();
			System.out.println("Withdraw limit: ");
			Double LimitSaque = sc.nextDouble();
			
			System.out.println();
			System.out.println("Enter amount for withdraw: ");
			Double valorDoSaque = sc.nextDouble();
			
			Account conta = new Account(num, nome, iniBalance, LimitSaque);
			conta.withdraw(valorDoSaque);
			
			System.out.println("New balance: " + String.format("%.2f",conta.getBalance()));
		
		} 
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro Inesperado");
		}
		
		
		sc.close();
		
	}

}

package javabackend;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class FolhaPagamento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		func.nome = "Joao";
		System.out.printf("Funcionario: " + func.nome + ", $ %.2f%n", func.salarioLiquido());
		String aumento = sc.next();
		System.out.println("Quanto vai ser o Aumento: " + aumento + "%");
		
		func.imposto(aumento);
		
		System.out.printf("O salario foi para : %.2f%n", func.salario);
		
		
		sc.close();
		
		
		
		
		
	}

}

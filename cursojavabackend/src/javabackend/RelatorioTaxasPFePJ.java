package javabackend;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Individual;
import entities.Company;

public class RelatorioTaxasPFePJ {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of tax payers: ");
		int qtd = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.println("Individual or company (i/c)? ");
			char pfPj = sc.next().charAt(0);
			
			if (pfPj == 'i') {
				System.out.println("name: ");
				String nome = sc.next();
				System.out.println("Anual income: ");
				Double anual = sc.nextDouble();
				System.out.println("Health expenditures: ");
				Double dexpH = sc.nextDouble();
				list.add(new Individual(nome, anual, dexpH));
			} else {
				System.out.println("name: ");
				String nome = sc.next();
				System.out.println("Anual income: ");
				Double anual = sc.nextDouble();
				System.out.println("Number of employees: ");
				Double NumFunc = sc.nextDouble();
				list.add(new Company(nome, anual, NumFunc));
			}
			
		} 
		System.out.println();
		double total = 0;
		System.out.println("TAXES PAID:");
		for (TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName()+ ": " + "$ " 
					+ String.format("%.2f",taxPayer.tax()));
			total += taxPayer.tax();
		}
		System.out.println();
		System.out.println("Total Taxes: " + String.format("%.2f", total));
		
		sc.close();
		
	}

}

package javabackend;

import java.util.Locale;
import java.util.Scanner;

public class ValorDolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preco do Dolar: "  );
		double precoDolar = sc.nextDouble();
		
		System.out.println("Quantos Dolares vai Comprar ? "  );
		double qtdDolar = sc.nextDouble();
		
		double totalPagar = calculadora(precoDolar, qtdDolar);
		System.out.printf("Total a pagar: %.2f%n", totalPagar);
				
		sc.close();
	}

		public static double calculadora(double precoDolar, double qtdDolar) {
			double resultadoDolar = precoDolar * qtdDolar;
			double resultadoImposto = resultadoDolar / 100 * 6;
			double resultadoFinal = resultadoDolar + resultadoImposto;
			return resultadoFinal;
			
		}
	
}

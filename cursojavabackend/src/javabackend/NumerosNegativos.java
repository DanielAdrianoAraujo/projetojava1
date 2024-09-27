package javabackend;

import java.util.Locale;
import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai Digita: ");
		int n = sc.nextInt();
		double[] numNegativo = new double[n];
		
		for (int i=0; i<numNegativo.length; i++) {
			System.out.println("Digite um numero: ");
			numNegativo[i] = sc.nextDouble();
		}
		
		System.out.println("------Numeros Negativos: ");
		for (int i=0; i<numNegativo.length; i++) {
			if (numNegativo[i] < 0) {
				System.out.println(numNegativo[i]);
			}
		}
		
		sc.close();
	}

}

package cursojava.executavel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "Daniel, Java, 10, 20, 30, 40";
		
		String[] valoresArray = texto.split(",");
		
		/*
		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Cuso: " + valoresArray[1]);
		System.out.println("Nota 1: " + valoresArray[2]);
		System.out.println("Nota 2: " + valoresArray[3]);
		System.out.println("Nota 3: " + valoresArray[4]);
		System.out.println("Nota 4: " + valoresArray[5]);
		*/
		
		// Convertendo um Array para uma Lista
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		// Converter uma lista para array
		String[] conversaoArray = list.toArray(new String[6]);
		
		for (int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
		
		System.out.println();
		
		
	}
}

package cursojava.executavel;

public class Matriz {
	
	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 70;
		notas[0][2] = 60;
		
		notas[1][0] = 20;
		notas[1][1] = 30;
		notas[1][2] = 40;
	
		// Percorre as Linhas
		for (int posLinha = 0; posLinha < notas.length; posLinha++) {
			System.out.println("=====================================");
			// Para Cada Linha Percorre as Colunas Array
			for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {
				System.out.println("Valor Matriz: " + notas[posLinha][posColuna]);
			}
		}
		
		
		/*
		for (int pos = 0; pos <= notas.length; pos++) {
			System.out.println("Notas multidimensionais: " + notas[0][pos]);
		}
		
		System.out.println();
		
		for (int pos = 0; pos <= notas.length; pos++) {
			System.out.println("Notas multidimensionais 2: " + notas[1][pos]);
		} */
		
	}

}

package cursojava.executavel;

import javax.swing.JOptionPane;

public class SegundaClasseJava {

	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno Aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em Recuperação: " + media);
		} else {
			System.out.println("Aluno Reprovado: " + media);
		}

		/* Operador Ternário */

		String saidaResultado = media >= 70 ? "Aluno Aprovado"
				: (media >= 40 && media <= 69) ? "Aluno em Recuperação" : "Aluno Reprovado";

		System.out.println(saidaResultado);

		/* */

		int numero = 0;

		while (numero <= 1) {

			System.out.println("O numero atual é: " + numero);
			numero++;
		}

		for (int numero2 = 0; numero2 <= 10; numero2++) {
			System.out.println("O numero é: " + numero2);
		}

		for (int numero3 = 10; numero3 >= 0; numero3--) {
			System.out.println("O numero mudou: " + numero3);
		}

		String carros = JOptionPane.showInputDialog("Informe a qtd de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a qtd de pessoas");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado " + "da divisão?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para cada um deu " + divisao);
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto " + "da divisão?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é: " + resto);
		}

		String not1 = JOptionPane.showInputDialog("Entre com a Nota1");
		String not2 = JOptionPane.showInputDialog("Entre com a Nota2");
		String not3 = JOptionPane.showInputDialog("Entre com a Nota3");
		String not4 = JOptionPane.showInputDialog("Entre com a Nota4");

		double notaOfc1 = Double.parseDouble(not1);
		double notaOfc2 = Double.parseDouble(not2);
		double notaOfc3 = Double.parseDouble(not3);
		double notaOfc4 = Double.parseDouble(not4);

		double mediaOfc = (notaOfc1 + notaOfc2 + notaOfc3 + notaOfc4) / 4;

		if (mediaOfc >= 70) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado: " + mediaOfc);
		} else if (mediaOfc >= 40 && mediaOfc <= 69) {
			JOptionPane.showMessageDialog(null, "Aluno em Recuperação: " + mediaOfc);
		} else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado: " + mediaOfc);
		}
	}

}

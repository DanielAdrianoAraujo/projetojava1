package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");
		aluno.setNomeEscola("FGV");
		
		
		double [] notas = {8.8, 9.9, 5.9, 6.9};
		double [] notas2 = {10, 10, 10, 10};
		double [] notas3 = {9, 8, 7, 6};
		double [] notas4 = {6.2, 7.5, 7.9, 8};
		
		
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplinax("Java");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);
		//
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplinax("OO");
		disciplina2.setNota(notas2);
		aluno.getDisciplinas().add(disciplina2);
		//
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplinax("JS");
		disciplina3.setNota(notas3);
		aluno.getDisciplinas().add(disciplina3);
		//
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplinax("Kotlin");
		disciplina4.setNota(notas4);
		aluno.getDisciplinas().add(disciplina4);
		
		
		System.out.println("Nome Aluno: " + aluno.getNome() + " => Matriculado: " +
		aluno.getNomeEscola());
		System.out.println("------------------- Disciplina do Aluno -------------------");
		
		for (Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + disc.getDisciplina());
			System.out.println("As Notas da Disciplina " + disc.getDisciplina() + " Sao: ");
			
			for (int pos = 0; pos < disc.getNota().length; pos++) {
				System.out.println("Nota: " + (pos+1) + " = " + disc.getNota()[pos]);
			}
			System.out.println();
		}		
		
	}
}



// 21/03/2024

/*
String posicoes = JOptionPane.showInputDialog("Tamanho do Array ?");
		

// Array sempre deve ter a quantidade de posições definidas
//double[] notas = new double[4];
double[] notas = new double[Integer.parseInt(posicoes)];

*/

/*	notas[0] = 9.8;
notas[1] = 10.1;
notas[2] = 9.0;
notas[3] = 9.5; */

/*	
for (int pos = 0; pos < notas.length; pos++) {
	String valor = JOptionPane.showInputDialog("Valor das Notas: " + (pos + 1));
	notas[pos] = Double.valueOf(valor);
}

for (int pos = 0; pos < notas.length; pos++) {
	System.out.println("Nota " + (pos + 1) + ": " + notas[pos]);
}

*/

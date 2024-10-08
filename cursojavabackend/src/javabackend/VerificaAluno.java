package javabackend;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Alunos;

public class VerificaAluno {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Set<Alunos> set = new HashSet<>();
		
		int numeroAluno = 0;
		
		System.out.println("How many students for course A? ");
		int NumA = sc.nextInt();
		for (int i = 0; i < NumA ; i++) {
			numeroAluno = sc.nextInt();
			set.add(new Alunos (numeroAluno));
		}
		
		System.out.println();
		System.out.println("How many students for course B? ");
		NumA = sc.nextInt();
		for (int i = 0; i < NumA ; i++) {
			numeroAluno = sc.nextInt();
			set.add(new Alunos (numeroAluno));
		}
		
		System.out.println();
		System.out.println("How many students for course C? ");
		NumA = sc.nextInt();
		for (int i = 0; i < NumA ; i++) {
			numeroAluno = sc.nextInt();
			set.add(new Alunos (numeroAluno));
		}
		
		// Total repetindo Alunos por curso - Contem Erro
		System.out.println("Total students: " + set.size());
		
		sc.close();
		
		
	}

}

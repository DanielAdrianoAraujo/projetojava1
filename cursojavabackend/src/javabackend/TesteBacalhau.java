package javabackend;

import entities.ClassesTestesBacalhau;

public class TesteBacalhau {

	public static void main(String[] args) {

		ClassesTestesBacalhau t = new ClassesTestesBacalhau();
		
		// Antes de chamar o método
		System.out.println(t.getNome());
		
		System.out.println("-----------------------");
		// chamando o metodo completa nome e colocando na memoria
		t.completaNome();
		System.out.println(t.getNome());
		
		System.out.println("-----------------------");
		// chamando o metodo completa nome2 e colocando na memoria
		t.completaNome2("Adriano de Araujo");
		System.out.println(t.getNome());
		
		
		System.out.println("-----------------------");
		// chamando o metodo completa nome3 e retornando o valor
		System.out.println(t.completaNome3());
		
		System.out.println("-----------------------");
		// chamando o metodo calculador passando parametro
		//e retornando o valor
		t.setContador(115);
		t.cont(5);
		System.out.println(t.getContador());
		
	}

	
}

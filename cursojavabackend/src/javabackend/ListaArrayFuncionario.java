package javabackend;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FuncionarioLista;

public class ListaArrayFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<FuncionarioLista> list = new ArrayList<>();
		
		System.out.println("Quantos Empregados serão Registrados? ");
		int qtdEmp = sc.nextInt();
		
		for (int i = 0; i < qtdEmp; i++) {
			System.out.println("ID: ");
			int id = sc.nextInt();
			
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			
			FuncionarioLista func = 
			new FuncionarioLista(id, name, salario);
			
			list.add(func);
		}
		
		System.out.println("Aumento para qual Funcinario? ");
		int aumentoFunc = sc.nextInt();
		
		// Lambda
		//Employee emp = list.stream().filter(x -> x.getId() == aumentoFunc).findFirst().orElse(null);
		
		Integer pos = posicao(list,aumentoFunc);
		
		if (pos == null) {
			System.out.println("Funcionario Não Existe");
		} else {
			System.out.println("Entre com a porcentagem: ");		
			double porcent = sc.nextDouble();
			list.get(pos).aumentoSalarioFunc(porcent);
		}
		
		System.out.println();
		System.out.println("Lista de Empregado");
		
		for (FuncionarioLista funcLista : list) {
			System.out.println(funcLista);
		} 
		
				
		sc.close();
	}

	public static Integer posicao(List<FuncionarioLista> listP, int id) {
		for (int i = 0; i < listP.size(); i++) {
			if (listP.get(i).getId() == id) {
				return i;
			}
		} 
		return null;
		
	}
}

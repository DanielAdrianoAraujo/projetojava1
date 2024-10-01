package javabackend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class ProcessaProduto {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> listProduto = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int numProd = sc.nextInt();
		
		for (int i = 0; i < numProd; i++) {
			System.out.println("Product #" + i + 1 + "data: ");
			System.out.println("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.println("name: ");
			String nome = sc.next();
			System.out.println("price: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				listProduto.add(new Produto(nome, price));
			} else if (type == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date dataF = sdf.parse(sc.next());
				listProduto.add(new ProdutoUsado(nome, price, dataF));
			} else {	
				
				System.out.println("Customs fee: ");
				double fee = sc.nextDouble();
				listProduto.add( new ProdutoImportado(nome, price, fee));
				
			}
		}
		
		System.out.println("PRICE TAGS:");
		
		for (Produto prod : listProduto) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}

package javabackend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ProcessaPedido {

	public static void main(String[] args) throws ParseException {

		//Product product = new Product();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		/*Order orderStatus = new Order();
		SimpleDateFormat datanasc = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> product = new ArrayList<>();
		OrderItem orderItem =  new OrderItem(); */
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome: ");
		String name = sc.next();
		
		System.out.println("Email: ");
		String email = sc.next();
		
		System.out.println("Birth Date: ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		System.out.println("How many items to this order?: ");
		int qtdOrder = sc.nextInt();
		
		Order order = new Order(new Date(), status, client);
		
		for (int i = 0; i < qtdOrder; i++) {
			System.out.println("Enter#" + (i + 1) + "item data:");
			System.out.println("Product name: ");
			String nomeProd = sc.next();
			System.out.println("Product price: ");
			double preco = sc.nextDouble();
			System.out.println("Quantity: ");
			int qtd = sc.nextInt();
			
			Product prod1 = new Product(nomeProd, preco);
			
			OrderItem it = new OrderItem(qtd, preco, prod1);
			
			order.addItem(it);
		}
		
		System.out.println(order);
		
		sc.close();
		
		
		
	}
	
	

}

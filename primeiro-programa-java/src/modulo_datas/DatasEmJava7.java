package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {

	public static void main(String[] args) {
		
		LocalDate database = LocalDate.parse("2024-04-09");
		
		for (int mes = 1; mes <= 12; mes++) {
			database = database.plusMonths(1);
			
			System.out.println("Vencimento Boleto: " + 
			database.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
			" do mes " + mes);
		}
		
		System.out.println("Mais 5 dias: " + (database = database.plusDays(5)));
		
		System.out.println("Mais 5 semanas: " + (database = database.plusWeeks(5)));
		
		System.out.println("Mais 5 meses: " + (database = database.plusMonths(5)));
		
		System.out.println("Mais 5 anos: " + (database = database.plusYears(5)));
		
		// **********************************
		
		System.out.println("Menos 5 dias: " + (database = database.minusDays(5)));
		
		System.out.println("Menos 5 semanas: " + (database = database.minusWeeks(5)));
		
		System.out.println("Menos 5 meses: " + (database = database.minusMonths(5)));
		
		System.out.println("Menos 5 anos: " + (database = database.minusYears(5)));
		
	}
}

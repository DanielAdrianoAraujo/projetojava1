package modulo_datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava5 {

	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000); // Verificar um processo com tempo que não conhecemos
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duracao Segundos: " + duracao.getSeconds());
		
		System.out.println("Duracao Nano: " + duracao.getNano());
		
		System.out.println("Duracao Milli: " + duracao.toMillis());
		
		// ************************************************************************

				/*
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Data Atual: " + 
		localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
		System.out.println("Dia da Semana: " +
		localDate.getDayOfWeek());
		
		System.out.println("Dia do Mes: " +
		localDate.getDayOfMonth());
		
		System.out.println("Dia do Ano: " +
		localDate.getDayOfYear());
		
		System.out.println("Mes: " +
		localDate.getMonth());
		
		System.out.println("Ano: " +
		localDate.getYear()); 
		
		*/
		
	}
		
		

}

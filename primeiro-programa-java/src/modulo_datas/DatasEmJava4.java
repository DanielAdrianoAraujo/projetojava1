package modulo_datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava4 {

	public static void main(String[] args) {
		 
		// Nova API de data a partir do Java 8
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data Atual: " + 
		dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora Atual: " + 
		horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora Atual / TimeStemp: " + 
		dataHoraAtual.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
		
	}

}

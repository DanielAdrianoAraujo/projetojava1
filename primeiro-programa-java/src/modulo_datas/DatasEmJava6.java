package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava6 {

	public static void main(String[] args) {
		 
		//LocalDate dataAntiga = LocalDate.of(2022, 4, 9);
		
		LocalDate dataAntiga = LocalDate.parse("2022-04-09");
		
		//LocalDate dataNova = LocalDate.of(2024, 4, 8);
		
		LocalDate dataNova = LocalDate.parse("2024-04-08");
		
		System.out.println("DT Antiga Maior DT Atual: " +
		dataAntiga.isAfter(dataNova));
		
		System.out.println("DT Antiga Maior DT Atual: " +
		dataNova.isAfter(dataAntiga));
		
		System.out.println("DT Atual Maior DT Antiga: " +
		dataNova.isBefore(dataAntiga));
		
		System.out.println("DT Atual Maior DT Antiga: " +
		dataAntiga.isBefore(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Periodo: " + periodo.getYears() + " Anos ");
		
		System.out.println("Periodo: " + periodo.getMonths() + " Meses ");
		
		System.out.println("Periodo: " + periodo.getDays() + " Dias ");

	}

}

package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DataEmJava2 {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); // Pegar a Data Atual
		
		// Simular que a data vem do BD
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-04-2024"));
	
		calendar.add(Calendar.DAY_OF_MONTH, 65);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		//System.out.println(calendar.getTime());
		
		long datas = ChronoUnit.DAYS.between(LocalDate.parse("2024-03-17"), LocalDate.now());

		System.out.println("Diferença de " + datas + " dias ");
	}

}

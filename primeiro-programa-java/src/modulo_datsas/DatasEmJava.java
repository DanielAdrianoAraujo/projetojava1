package modulo_datsas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		Date date =  new Date();
		
		System.out.println("Data Milisegundos: " + date.getTime());
		
		System.out.println("Dia do Mes: " + date.getDate());
		
		System.out.println("Dia da Semana: " + date.getDay());
		
		System.out.println("Hora do Dia: " + date.getHours());
		
		System.out.println("Minuto da Hora: " + date.getMinutes());
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		
		// ---------------- Simple Date Format ----------------------
		
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data Atual: " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Data formato Banco de Dados: " + 
		  simpleDateFormat.format(date));
				
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1979-03-17"));
		
		
	}

}

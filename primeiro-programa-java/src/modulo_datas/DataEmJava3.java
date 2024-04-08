package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava3 {

	public static void main(String[] args) throws ParseException {

		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("10/04/2024");

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);

		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, +1);
			System.out.println("Parcela: " + parcela + " Vence em: "
					+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}

	}

}

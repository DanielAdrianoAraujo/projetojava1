package cursojava.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando2 {

	public static void main(String[] args) throws Exception {

		File file = new File(
				"C:\\Users\\adria\\git\\repository\\primeiro-programa-java\\src\\cursojava\\classes\\arquivo_excel.xls");

		FileInputStream entrada = new FileInputStream(file);

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // Prepara a entrada do arquivo
		HSSFSheet planiha = hssfWorkbook.getSheetAt(0); // Pegando a planilha

		Iterator<Row> linhaIterator = planiha.iterator();

		while (linhaIterator.hasNext()) { // Enquanto tiver linha
			Row linha = linhaIterator.next(); // Dados da pessoa na linha

			int numeroCelulas = linha.getPhysicalNumberOfCells(); // Quantidade de linhas

			String valorCelulas = linha.getCell(0).getStringCellValue();
			
			linha.getCell(0).setCellValue(valorCelulas + " Adicionando Valor ");
			
			
			
		/*	Cell cell = linha.createCell(numeroCelulas); // Cria nova celula na linha
			cell.setCellValue("10.000,00"); */

		}

		entrada.close();

		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();

		System.out.println("Planilha Atualizada");
	}

}

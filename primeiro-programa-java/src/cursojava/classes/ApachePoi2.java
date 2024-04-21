package cursojava.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {

	public static void main(String[] args) throws Exception {

		System.out.println("Daniel Adriano");
		
		FileInputStream entrada = new FileInputStream(new File(
				"C:\\Users\\adria\\git\\repository\\primeiro-programa-java\\src\\cursojava\\classes\\arquivo_excel.xls"));

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // Prepara a entrada do arquivo excel para ler
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); // Pega a primeira planilha do excel

		Iterator<Row> linhaIterator = planilha.iterator(); // Percorre as linhas

		List<PessoaAquivo> pessoas = new ArrayList<PessoaAquivo>();

		while (linhaIterator.hasNext()) { // Ler todas as linhas do arquivo
			Row linha = linhaIterator.next(); // Dados da pessoa na linha
			Iterator<Cell> celulas = linha.iterator();

			PessoaAquivo pessoa = new PessoaAquivo();

			while (celulas.hasNext()) { // Percorre todas as celulas
				Cell cell = celulas.next();

				switch (cell.getColumnIndex()) {

				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());


				}

			}

			pessoas.add(pessoa);

		}

		entrada.close();

		for (PessoaAquivo pessoaAquivo : pessoas) {
			System.out.println(pessoaAquivo);
		}

	}

}

package cursojava.classes;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws Exception {

		File file = new File(
				"C:\\Users\\adria\\git\\repository\\primeiro-programa-java\\src\\cursojava\\classes\\arquivo_excel.xls");

		if (!file.exists()) {
			file.createNewFile();
		}

		PessoaAquivo pessoa1 = new PessoaAquivo();
		pessoa1.setNome("Daniel");
		pessoa1.setEmail("daniel@gmail.com");
		pessoa1.setIdade(45);

		PessoaAquivo pessoa2 = new PessoaAquivo();
		pessoa2.setNome("Adriano");
		pessoa2.setEmail("adriano@gmail.com");
		pessoa2.setIdade(35);

		PessoaAquivo pessoa3 = new PessoaAquivo();
		pessoa3.setNome("Araujo");
		pessoa3.setEmail("araujo@gmail.com");
		pessoa3.setIdade(25);

		PessoaAquivo pessoa4 = new PessoaAquivo();
		pessoa4.setNome("Ben");
		pessoa4.setEmail("ben@gmail.com");
		pessoa4.setIdade(20);

		List<PessoaAquivo> pessoas = new ArrayList<PessoaAquivo>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
		HSSFSheet criaPlanilha = hssfWorkbook.createSheet("Planilha de Pessoas"); // Criando a Planilha

		int numeroLinhas = 0;
		for (PessoaAquivo p : pessoas) {
			Row linhas = criaPlanilha.createRow(numeroLinhas++); // Criando as linhas no Excel

			int celula = 0;

			Cell celNome = linhas.createCell(celula++);
			celNome.setCellValue(p.getNome());

			Cell celEmail = linhas.createCell(celula++);
			celEmail.setCellValue(p.getEmail());

			Cell celIdade = linhas.createCell(celula++);
			celIdade.setCellValue(p.getIdade());
		}

		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida); // Escreve a planilha em arquivo

		saida.flush();
		saida.close();
		hssfWorkbook.close();

		System.out.println("Planilha Criada");

	}

}

package cursojava.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaArquivo = new FileInputStream(new File(
				"C:\\Users\\adria\\git\\repository\\primeiro-programa-java\\src\\cursojava\\classes\\arquivo.txt"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		List<PessoaAquivo> pessoas = new ArrayList<PessoaAquivo>();

		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();
//			String linha = lerArquivo.next(); // vai para a proxima linha com conteudo

			if (linha != null && !linha.isEmpty()) {
				// System.out.println(linha);
				String[] dados = linha.split("\\;");

				PessoaAquivo pessoaArquivo = new PessoaAquivo();
				int i = 0;
				pessoaArquivo.setNome(dados[i]);
				i++;
				pessoaArquivo.setEmail(dados[i]);
				i++;
				pessoaArquivo.setIdade(Integer.parseInt(dados[i]));

				pessoas.add(pessoaArquivo);

			}

		}

		for (PessoaAquivo p1 : pessoas) {
			System.out.println(p1);
		}

	}

}

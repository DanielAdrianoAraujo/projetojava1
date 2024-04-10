package cursojava.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	
	public static void main(String[] args) throws IOException {
		
		
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
		
		List<PessoaAquivo> pessoas = new ArrayList<PessoaAquivo>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		
		File arquivo = new File("C:\\Users\\adria\\git\\repository\\primeiro-programa-java\\src\\cursojava\\classes\\arquivo.txt");
		
		if (!arquivo.exists()){
			arquivo.createNewFile();
		}
		
		FileWriter escreve_no_arquivo = new FileWriter(arquivo);
		
//		escreve_no_arquivo.write("Meu teste no Arquivo");
	//	escreve_no_arquivo.write("Minha Segunda Linha");
		/*
		for (int i = 1; i <= 10; i++) {
			escreve_no_arquivo.write("Texto da minha linha " + i + "\n");
			
		} */
		
		
		for (PessoaAquivo p : pessoas) {
			escreve_no_arquivo.write("Nome: " + p.getNome() + ";" +
			"Email: " + p.getEmail() + ";" + "Idade: " + p.getIdade() + "\n");
		}
		
		
		escreve_no_arquivo.flush();
		escreve_no_arquivo.close();
		
		
	}

}

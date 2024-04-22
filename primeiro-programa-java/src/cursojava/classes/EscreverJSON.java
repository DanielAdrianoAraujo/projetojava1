package cursojava.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreverJSON {

	public static void main(String[] args) throws IOException {
		
		Usuario user1 = new Usuario();
		user1.setCpf("345435435");
		user1.setLogin("adm");
		user1.setSenha("adm");
		user1.setNome("Daniel");
		
		Usuario user2 = new Usuario();
		user2.setCpf("88888888888");
		user2.setLogin("adm");
		user2.setSenha("senha");
		user2.setNome("Adriano");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(user1);
		usuarios.add(user2);
		
		// Deixa mais organizado
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
				
		String jsonUser =  gson.toJson(usuarios);
		
		//String jsonUser =  new Gson().toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\adria\\git\\repository\\primeiro-programa-java\\src\\cursojava\\classes\\filjosn.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		
	}

}

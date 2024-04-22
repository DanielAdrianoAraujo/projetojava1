package cursojava.classes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

public class LerJson {

	public static void main(String[] args) throws IOException {
		
		FileReader fileReader = new FileReader("C:\\Users\\adria\\git\\repository\\primeiro-programa-java\\src\\cursojava\\classes\\filjosn.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> listUsuario = new ArrayList<Usuario>();
		
		for (JsonElement jsonElement : jsonArray) {
			
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuario.add(usuario);
		}
		
		System.out.println("Leitura do Arquivo Json " + listUsuario);
		
		
		
		
	}

}

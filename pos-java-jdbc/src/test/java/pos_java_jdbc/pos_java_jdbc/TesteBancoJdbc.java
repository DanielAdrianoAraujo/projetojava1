package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.jupiter.api.Test;

import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	
	@Test
	public void initBancoJdbc(){
		
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userPosJava = new Userposjava();
		
		userPosJava.setId(6L);
		userPosJava.setNome("DanBen");
		userPosJava.setEmail("danfreeflyer@yahoo.com.br");
		
		userPosDAO.salvar(userPosJava);
	}
	
	@Test
	public void initLista() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.lista();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("------------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void initBuscar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			Userposjava userPosJava = dao.buscar(1L);
			
				System.out.println(userPosJava);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void initAtualizar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			Userposjava objetoBanco = dao.buscar(5L);
			objetoBanco.setNome("Ben Araujo dos Santos");
			objetoBanco.setEmail("ben@yahoo.com.br");
			dao.atualizar(objetoBanco);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}

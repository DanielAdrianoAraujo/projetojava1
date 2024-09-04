package pos_java_jdbc.pos_java_jdbc;

import org.junit.jupiter.api.Test;

import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	
	@Test
	public void initBancoJdbc(){
		//SingleConnection.getConnection();
		
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userPosJava = new Userposjava();
		
		userPosJava.setId(4L);
		userPosJava.setNome("Ben");
		userPosJava.setEmail("danfreeflyer@yahoo.com.br");
		
		
		userPosDAO.salvar(userPosJava);
		
		
		
	}

}

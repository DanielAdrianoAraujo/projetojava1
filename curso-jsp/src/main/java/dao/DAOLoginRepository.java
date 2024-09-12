package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.SingleConnectionBanco;
import model.ModelLogin;

public class DAOLoginRepository {
	
	private Connection connection;
	
	
	public DAOLoginRepository() {
		connection = SingleConnectionBanco.getConnection();
	}
	
	public boolean validarAutenticacao(ModelLogin modelLogin) throws Exception {
		
		String sql = "Select * from model_login where upper(login) = upper(?) and upper(senha) = upper(?)";
		PreparedStatement statemament = connection.prepareStatement(sql);
		statemament.setString(1, modelLogin.getLogin());
		statemament.setString(2, modelLogin.getSenha());
		
		ResultSet resultSet = statemament.executeQuery();
		
		if (resultSet.next()) {
			return true;
		}
		return false;
	}

}

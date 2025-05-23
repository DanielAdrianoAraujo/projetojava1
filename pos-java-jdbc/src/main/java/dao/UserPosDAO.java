package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexaojdbc.SingleConnection;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class UserPosDAO {

	private Connection connection;

	public UserPosDAO() {
		connection = SingleConnection.getConnection();
	}

	public void salvar(Userposjava userposjava) {
		try {
			String sql = "insert into userposjava (nome, email)values (?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, userposjava.getNome());
			insert.setString(2, userposjava.getEmail());
			insert.execute();
			connection.commit();

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void salvarTelefone(Telefone telefone) {
		try {
			String sql = "INSERT INTO public.telefoneuser(numero, tipo, usuariopessoa) VALUES (?, ?, ?);";
			PreparedStatement insertTelefone = connection.prepareStatement(sql);
			insertTelefone.setString(1, telefone.getNumero());
			insertTelefone.setString(2, telefone.getTipo());
			insertTelefone.setLong(3, telefone.getUsuario());
			insertTelefone.execute();
			connection.commit();

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public List<Userposjava> lista() throws Exception {
		List<Userposjava> list = new ArrayList<Userposjava>();

		String sql = "Select * from userposjava";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();

		while (resultado.next()) {
			Userposjava userposjava = new Userposjava();
			userposjava.setId(resultado.getLong("id"));
			userposjava.setNome(resultado.getString("nome"));
			userposjava.setEmail(resultado.getString("email"));

			list.add(userposjava);

		}

		return list;
	}

	public Userposjava buscar(Long Id) throws Exception {
		Userposjava retorno = new Userposjava();

		String sql = "Select * from userposjava where id = " + Id;
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultado = statement.executeQuery();

		while (resultado.next()) {
			retorno.setId(resultado.getLong("id"));
			retorno.setNome(resultado.getString("nome"));
			retorno.setEmail(resultado.getString("email"));

		}

		return retorno;
	}

	public void atualizar(Userposjava userPosJava) {

		String sql = "update userposjava set nome = ?, email = ? where id =  " + userPosJava.getId();

		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, userPosJava.getNome());
			statement.setString(2, userPosJava.getEmail());
			statement.execute();

			connection.commit();

		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	public void deletar(Long id) {

		try {

			String sql = "delete from userposjava where Id = " + id;
			PreparedStatement statemant = connection.prepareStatement(sql);
			statemant.execute();
			connection.commit();

		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	public List<BeanUserFone> listaUserFone(Long IdUser) {

		List<BeanUserFone> beanUserFones = new ArrayList<BeanUserFone>();

		String sql = "Select nome, numero, email from telefoneuser as fone ";
		sql += " inner join userposjava as userp ";
		sql += " on fone.usuariopessoa = userp.id ";
		sql += " where userp.id = " + IdUser;

		try {
			PreparedStatement statement;
			statement = connection.prepareStatement(sql);

			ResultSet resultado = statement.executeQuery();

			while (resultado.next()) {
				BeanUserFone userFone = new BeanUserFone();
				userFone.setEmail(resultado.getString("email"));
				userFone.setNome(resultado.getString("nome"));
				userFone.setNumero(resultado.getString("numero"));
				beanUserFones.add(userFone);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return beanUserFones;

	}

	public void deleteFonePorUser(Long iduser) {

		try {

			String sqlFone = "delete from telefoneuser where usuariopessoa = " + iduser;
			String sqlUser = "delete from userposjava where Id = " + iduser;

			PreparedStatement statemant = connection.prepareStatement(sqlFone);
			statemant.executeUpdate();
			connection.commit();

			statemant = connection.prepareStatement(sqlUser);
			statemant.executeUpdate();
			connection.commit();

		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}

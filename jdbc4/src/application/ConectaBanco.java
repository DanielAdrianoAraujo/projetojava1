package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class ConectaBanco {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
	
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");

			st.setDouble(1, 500.0);
			st.setInt(2, 4);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
	

}

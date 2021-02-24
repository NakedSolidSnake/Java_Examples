package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;


public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);	// needs a confirmation to update the sql process by programmer
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			/* Remove this logic to work nomarly */
			int x = 1;
			if(x < 2) {
				throw new SQLException("Simule Error"); //to stop sql process
			}
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit();	//confirmation
		
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);
		}
		catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Trasaction rolled back: " + e.getMessage());
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		finally {
			DB.closeStatment(st);
			DB.closeConnection();
		}
	}
}


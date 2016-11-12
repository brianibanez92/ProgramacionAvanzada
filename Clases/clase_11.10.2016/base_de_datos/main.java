package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost/test";
		String user = "";
		String password = "";
		
		
		try {
			
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement("select * from users");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				int id = rs.getInt("idusers");
				String name = rs.getString("name");
				
				System.out.println("nombre: " + name + " ---- id: " + id);
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

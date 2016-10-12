package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) {
		
		String URL = "Jdbc:MySql://localhost:3306/test";
		String Root = "";
				
		try {
			
			Connection con = DriverManager.getConnection(URL, Root, null);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package com.utn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdministradorDeConexiones {

	public static Connection getConexion() throws SQLException{
		   Connection cn = null;
		   String DB_URL = "jdbc:mysql://localhost:3306/test";

		   String USER = "root";
		   String PASS = null;
		   
		   try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection(DB_URL, USER, PASS);
		}catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		   
		return cn;
	}
}

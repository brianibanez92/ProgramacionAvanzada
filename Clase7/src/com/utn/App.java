package com.utn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		Connection cn=null;
		try {
			cn=AdministradorDeConexiones.getConexion();
			PreparedStatement ps= cn.prepareStatement("Select * from datos");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("id: "+rs.getInt(1)+", dato:"+rs.getString(2));
			}
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		}
		
		
	}

}

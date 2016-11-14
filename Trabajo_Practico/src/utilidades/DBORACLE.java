package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBORACLE {
 private static Connection conexion;
	   
		private static void conectar() {
			 try {
					String url = "jdbc:oracle:thin:@localhost:1521/xe";
					String user = "sistemaDB";
					String pass = "sistemaDB"; 
		            conexion=DriverManager.getConnection (url, user,pass);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }  
		}
		public static boolean ejecutar(String sql) {
	        try {
	        	conectar();
	            Statement sentencia = conexion.createStatement();
	            sentencia.executeUpdate(sql);
	            sentencia.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }        return true;
	    }
}

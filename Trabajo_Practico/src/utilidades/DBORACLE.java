package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBORACLE {
 private static Connection conexion;
	   
		public static Connection getConnection() {
			 try {
					String url = "jdbc:oracle:thin:@localhost:1521/xe";
					String user = "sistemaDB";
					String pass = "sistemaDB"; 
		            conexion=DriverManager.getConnection(url, user,pass);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			return conexion;  
		}
		public static boolean ejecutar(String sql) {
	        try {
	            Statement sentencia = conexion.createStatement();
	            sentencia.executeUpdate(sql);
	            sentencia.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }        return true;
	    }
		
		public static void setConexion(Connection conexion) {
			DBORACLE.conexion = conexion;
		}
		
		
}

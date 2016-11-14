package ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBORACLE {
	 private Connection conexion;
	 
	 public Connection getConexion() {
		    return conexion;
		}    
		public void setConexion(Connection conexion) {
		        this.conexion = conexion;
		}    
		public DBORACLE conectar() {
			 try {
					String url = "jdbc:oracle:thin:@localhost:1521/xe";
					String user = "sistemaDB";
					String pass = "sistemaDB"; 
		            setConexion(DriverManager.getConnection (url, user,pass));
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        return this;
		}
		public boolean ejecutar(String sql) {
	        try {
	            Statement sentencia = getConexion().createStatement();
	            sentencia.executeUpdate(sql);
	            sentencia.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }        return true;
	    }
}

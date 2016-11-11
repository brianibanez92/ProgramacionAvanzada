package clases;

import java.sql.Connection;
import java.sql.DriverManager;

import servicios.Consultas;

public class Main {

	public static void main(String[] args) {
		Persona p1=new Persona();
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection ("jdbc:odbc:<ruta_a_la_BD>", "usuario","password");
			}catch(Exception e){
		}
		Consultas.guardar(p1);
	}

}

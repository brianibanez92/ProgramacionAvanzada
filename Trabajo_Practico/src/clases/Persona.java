package clases;

import anotaciones.Columna;
import anotaciones.Tabla;

@Tabla(nombre = "sys_Personas")
public class Persona {

	@Columna(nombre = "sys_nombre")
	private String nombre;
	
	@Columna(nombre = "sys_apellido")
	private String apellido;
}

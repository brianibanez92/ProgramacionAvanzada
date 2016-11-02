package com.utn.ejemplo1;

@Tabla (nombre = "sys_persona")
public class Persona {
	
	@columna(nombre="nombre")
	public String nombre;
	
	@columna(nombre="apellido")
	public String apellido;
}

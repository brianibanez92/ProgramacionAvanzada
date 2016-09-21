package com.utn.PatronComportamiento.state;

public class Empleado {
    IEstado estado;
    String nombre;
    String apellido;
	public IEstado getEstado() {
		return estado;
	}
	public void setEstado(IEstado estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
    
}

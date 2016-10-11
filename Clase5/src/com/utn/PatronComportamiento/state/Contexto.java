package com.utn.PatronComportamiento.state;

public class Contexto {
	private static IEstado estado;
	public Contexto(){
		estado=new Baja();
	}
	public void executarAccion(Empleado emp){
		estado.cambiarEstado(emp);
	}
}

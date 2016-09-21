package com.utn.PatronComportamiento.state;

public class Contexto {
	private static IEstado estado;
	public static void executarAccion(Empleado emp){
		estado.cambiarEstado(emp);
	}
}

package com.utn.PatronComportamiento.state;

public class Main {

	public static void main(String[] args) {
		Empleado emp=new Empleado();
		Contexto contexto=new Contexto();
	    contexto.executarAccion(emp);
	    contexto.executarAccion(emp);
	    contexto.executarAccion(emp);
	    contexto.executarAccion(emp);
	    contexto.executarAccion(emp);
	    contexto.executarAccion(emp);
	    contexto.executarAccion(emp);
	    contexto.executarAccion(emp);
	    
	}

}

package clases;

import servicios.Consultas;

public class Main {

	public static void main(String[] args) {
		Persona p1=new Persona();
		Consultas.guardar(p1);
	}

}

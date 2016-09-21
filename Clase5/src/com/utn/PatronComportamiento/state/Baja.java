package com.utn.PatronComportamiento.state;

public class Baja implements IEstado {

	@Override
	public void cambiarEstado(Empleado emp) {
		// TODO Auto-generated method stub
		System.out.println("Se dio de estado Baja");
		emp.setEstado(new Baja());
	}

}

package com.utn.PatronComportamiento.state;

public class Alta implements IEstado {

	@Override
	public void cambiarEstado(Empleado emp) {
		// TODO Auto-generated method stub
		System.out.println("Se dio de estado Alta");
		emp.setEstado(new Baja());
	}

}

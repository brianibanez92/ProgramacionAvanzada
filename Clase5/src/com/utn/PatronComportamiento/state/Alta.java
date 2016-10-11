package com.utn.PatronComportamiento.state;

public class Alta implements IEstado {

	@Override
	public void cambiarEstado(Empleado emp) {
		// TODO Auto-generated method stub
		System.out.print("Baja");
		emp.setEstado(new Baja());
	}

}

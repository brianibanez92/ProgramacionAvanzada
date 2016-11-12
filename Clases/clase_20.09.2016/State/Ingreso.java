package State;

public class Ingreso implements IEstado {

	//Sobrescribo el método cambiar de estado y como estoy en “Ingreso” cambio el
	//estado del alumno a “regular”
	@Override
	public void cambiarEstado(Alumno a) {
		a.setEstado(Estados.Regular);
		
	}

}

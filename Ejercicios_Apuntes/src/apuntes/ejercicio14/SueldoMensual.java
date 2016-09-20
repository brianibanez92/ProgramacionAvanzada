package apuntes.ejercicio14;

public class SueldoMensual implements ICalculoSueldo {

	@Override
	public float calcular(Empleado empleado) {
	    return empleado.getSueldo();
	}

}

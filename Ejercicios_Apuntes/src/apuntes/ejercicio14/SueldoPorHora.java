package apuntes.ejercicio14;

public class SueldoPorHora implements ICalculoSueldo {

	@Override
	public float calcular(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleado.getSueldo()*empleado.getCantidadHorasTrabajadas();
	}

}

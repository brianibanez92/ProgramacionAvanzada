package apuntes.ejercicio14;

public class CalcularSueldo {
private static ICalculoSueldo Isueldo;
	
	
	public static float getCalculo(Empleado e1){
		float result=0L;
		switch(e1.getTipoCobro()){
			case mensual:
				Isueldo=new SueldoMensual();
				result=Isueldo.calcular(e1);
				break;
			case porHora:
				Isueldo=new SueldoPorHora();
				result=Isueldo.calcular(e1);
				break;
		}
		return result;
	}
	
}

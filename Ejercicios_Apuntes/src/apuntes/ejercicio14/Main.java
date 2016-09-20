package apuntes.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Empleado> empleados=new ArrayList<Empleado>();
		empleados.add(new Empleado("Empleado","1","35-26622-22",true,15000L,eTipoCobro.mensual));
		empleados.add(new Empleado("Empleado","2","32-23222-22",true,90000L,eTipoCobro.mensual));
		empleados.add(new Empleado("Empleado","3","31-22692-22",true,56000L,eTipoCobro.mensual));
		empleados.add(new Empleado("Empleado","4","36-28882-22",true,25L,8,eTipoCobro.porHora));
		empleados.add(new Empleado("Empleado","5","39-29992-22",true,60L,6,eTipoCobro.porHora));
		
		empleados.stream().forEach(e->System.out.println(e.getNombre()+e.getApellido()+" Tiene un Sueldo de:"+CalcularSueldo.getCalculo(e)));

	}

}

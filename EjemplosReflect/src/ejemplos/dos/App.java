package ejemplos.dos;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import ejemplos.Entidad;
import ejemplos.OtraClase;

public class App {

	public static void main(String[] args) {
		// TODO Ejemplo de la pag.57-58
		OtraClase otra=new OtraClase();
		Entidad entidad=new Entidad(5, "Julian", "ElPepo", otra);
		Field[] fields=entidad.getClass().getDeclaredFields();
		
		for(Field f:fields){
			String field=f.getName();
			String getter="get"+String.valueOf(field.charAt(0)).toUpperCase()+field.substring(1);
			
			try {
				Method method=entidad.getClass().getDeclaredMethod(getter);
				Object value=method.invoke(entidad, new Object[0]);
				System.out.print("\n"+value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}

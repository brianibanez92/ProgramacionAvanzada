package ejemplos.tres;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import ejemplos.Entidad;

public class App {

	@SuppressWarnings({"unchecked", "rawtypes"})
	public static void main(String[] args) {
		// TODO Ejemplo de la pag.59
		Entidad entidad=new Entidad(7, "Emiliano", "Cementerio");
		Class clazz=entidad.getClass();
		Field[] fields=clazz.getDeclaredFields();
		
		for(Field f:fields){
			String field=f.getName();
			String getter="get"+String.valueOf(field.charAt(0)).toUpperCase()+field.substring(1);
			try {
				Method method= clazz.getMethod(getter);
				
				Object value=method.invoke(entidad, new Object[0]);
				
				if(value==null){
					value=emptyInstance(f.getType().getName());
				}
				
				System.out.println(value);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static Object emptyInstance(String type) {
		 Object obj = null;
		 try {
			 Class clazz = Class.forName(type);
		 for (Constructor con : clazz.getConstructors()) {
		 if (con.getParameterTypes().length == 0) {
			 obj = con.newInstance();
			 break;
		 	}
		 }
		 } catch (Exception e) {
			 return null;
		 }
		 	return obj;
		 }


}

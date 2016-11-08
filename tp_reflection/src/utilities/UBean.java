package utilities;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class UBean 
{

	/*Dentro del paquete “Utilidades” se debe crear una clase llamada UBean, la cual 
	constara de 3 métodos públicos y estáticos:
	
	a.  obtenerAtributos(Object): Devuelve un ArrayList<Field> con todos los atributos 
	que posee el parámetro Object.
	b.  ejecutarSet(Object o, String att, Object valor): Se debe ejecutar el método
	Setter del String dentro del Object.
	c.  ejecutarGet(Object o, String att): devolverá el valor del atributo pasado por 
	parámetro, ejecutando el getter dentro del objeto */
	

	public static List<Field> getAttributes (Object obj)
	{
		obj.getClass().getDeclaredFields();
		
		
		
		
		return new ArrayList<Field>();
	}
	
	public static void executeSetAttribute (Object obj, String attribute, Object value)
	{
		
	}
	
	public static Object executeGetAttribute (Object obj, String attribute)
	{
		return new Object();
	}
	
	
	
	
}

package utilities;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class UBean 
{

	/*Dentro del paquete �Utilidades� se debe crear una clase llamada UBean, la cual 
	constara de 3 m�todos p�blicos y est�ticos:
	
	a.  obtenerAtributos(Object): Devuelve un ArrayList<Field> con todos los atributos 
	que posee el par�metro Object.
	b.  ejecutarSet(Object o, String att, Object valor): Se debe ejecutar el m�todo
	Setter del String dentro del Object.
	c.  ejecutarGet(Object o, String att): devolver� el valor del atributo pasado por 
	par�metro, ejecutando el getter dentro del objeto */
	

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

package utilidades;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class UBean {
	//Hay que implementar todos estos metodos
	public static ArrayList<Field> obtenerAtributos(Object obj){
		Class<? extends Object> c1=obj.getClass();
		ArrayList<Field> ls=(ArrayList<Field>) Arrays.asList(c1.getDeclaredFields());
		return ls;
	}
	public static void ejecutarSet(Object o, String att, Object valor){
		Class<? extends Object> c1=o.getClass();
		c1.getName();
	}
	public static Object ejecutarGet(Object o, String att){
		Class clazz=o.getClass();
		Field[] fields=clazz.getDeclaredFields();
		Object value=new Object();
		for(Field f:fields){
			String field=f.getName();
			if(att==field){
				String getter="get"+String.valueOf(field.charAt(0)).toUpperCase()+field.substring(1);
				Method get;
				try {
					get = clazz.getDeclaredMethod(getter);
					value=get.invoke(o, new Object[0]);
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (NoSuchMethodException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		return value;
	}
}

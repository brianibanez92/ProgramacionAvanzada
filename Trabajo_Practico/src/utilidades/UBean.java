package utilidades;

import java.lang.reflect.Field;
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
		return null;
	}
}

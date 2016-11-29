package servicios;
import java.lang.reflect.Field;

import utilidades.DBORACLE;
import utilidades.UBean;
import anotaciones.Columna;
import anotaciones.Tabla;

public class Consultas {
	public static void guardar(Object o){
		Class<? extends Object> c=o.getClass();
		String tabla=getNameTable(c);
		String columnas = "";
		String valores = "";
		
		for(Field f:c.getDeclaredFields()){
			if(f.getAnnotation(Columna.class)!=null){
				  Columna colum=(Columna)f.getAnnotation(Columna.class);
				  columnas+= ","+getNameColumn(f);
				  valores+= ","+"'"+UBean.ejecutarGet(o, f.getName())+"'";
			}
		}
		valores=valores.substring(1);
		columnas=columnas.substring(1);
		
		
		String query="INSERT INTO "+tabla+"("+columnas+")VALUES("+valores+")";
		System.out.println(query);
		DBORACLE.ejecutar(query);
	}
	
	private static String getNameTable(Class clazz){
		Tabla tab= (Tabla) clazz.getAnnotation(Tabla.class);
		String tabla=tab.nombre().isEmpty()?clazz.getSimpleName():tab.nombre();
		return tabla;
	}
	private static String getNameColumn(Field field){
		Columna colum=(Columna)field.getAnnotation(Columna.class);
		String columna=colum.nombre().isEmpty()?field.getName():colum.nombre();
		return columna;
	}
}

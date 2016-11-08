package servicios;
import java.lang.reflect.Field;

import anotaciones.Columna;
import anotaciones.Tabla;

public class Consultas {
	public static void guardar(Object o){
		Class c=o.getClass();
		String tabla;
		String columnas = "";
		
		Tabla tab= (Tabla) c.getAnnotation(Tabla.class);
		tabla=tab.nombre();
		
		for(Field m:c.getDeclaredFields()){
			if(m.getAnnotation(Columna.class)!=null){
				Columna colum=(Columna)m.getAnnotation(Columna.class);
				if(colum.nombre()!=null){
				  columnas+= ","+colum.nombre();
				}
			}
		}
		
		System.out.println("Tabla: "+tabla);
		System.out.println("Columnas: "+columnas.substring(1));
	}
}

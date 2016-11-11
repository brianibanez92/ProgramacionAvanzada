package ejemplos.uno;

import java.lang.reflect.Field;

import ejemplos.Entidad;

public class App {

	public static void main(String[] args) {
		// TODO Ejemplo pag.57
		//Obtener array con los Fiels(Campos/Atributos) de la clase
		Field[] fields=Entidad.class.getDeclaredFields();
		
		//Recorrer cada uno de la Campos en el Array e imprimir su Nombre
		for(Field f:fields){
			System.out.println(f.getName());
		}
	}

}

package utn.com.clases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args){
		Auto a=new Auto("Ford","Falcon72",50000);
		
		Class c1=a.getClass();
		Class c2=Auto.class;
		
		try{
			Class c3=Class.forName("utn.com.clases");
			Object o1=Class.forName("utn.com.clases").newInstance();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Constructor[] con=c1.getConstructors();
		try {
			Object o2=con[1].newInstance("lala","ss",5);
			Object o3=c1.newInstance();
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.out.println("=====================================");
		System.out.println("Atributos");
		System.out.println("=====================================");
		for(Field f:c1.getDeclaredFields()){
			System.out.println(f.getName()+":"+f.getType());
		}
		
		System.out.println("\n=====================================");
		System.out.println("Metodos");
		System.out.println("=====================================");
		for(Method m:c2.getDeclaredMethods()){
			System.out.println("Metodo: "+m.getName());
			if(m.getName().equals("setMarca")){
				try {
					m.invoke(a, "Hola mundo");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		System.out.println("\n=====================================");
		System.out.println("Setteado en el metodo Invoke_Marca: "+a.getMarca());
		System.out.println("=====================================");
		
		
	}

}

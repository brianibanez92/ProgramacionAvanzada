package com.utn.anotaciones;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class test=Test.class;
		Test t1=new Test();
		
		//Ejecutar los metodos publicos de la clase
		for(Method m:test.getDeclaredMethods()){
			if(m.getName().equals("metodoTest")){
			  m.invoke(t1);
			}
			if(m.getName().equals("metodoIgnore")){
				m.invoke(t1);
			}
			}
		
		//Ejecutar los metodos con anotaciones TestMio
		for(Method m:test.getDeclaredMethods()){
			if(m.getAnnotation(TestMio.class)!=null){
				m.invoke(t1);
			}
		}
		
		System.out.print("\nEjecutar 10 veces los metodos que tengan anotaciones TestMio y cantidad 10\n");
		//Ejecutar 10 veces los metodos que tengan anotaciones TestMio y cantidad 10
		for(Method m:test.getDeclaredMethods())
			
			if(m.getAnnotation(TestMio.class)!=null){
				TestMio t=m.getAnnotation(TestMio.class);
				if(t.cantidad()==10){
					for(int  i=0;i<10;i++){
						m.invoke(t1);
				 }
			}
		}
	}	
}
	


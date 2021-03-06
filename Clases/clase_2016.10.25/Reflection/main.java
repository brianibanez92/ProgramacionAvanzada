package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class main {

	public static void main(String[] args) 
	{
		//PersonaReflection pr = new PersonaReflection();
		
		/*Constructor<?>[] constructors = PersonaReflection.class.getConstructors();
		for (Constructor<?> c : constructors) 
		{
			try 
			{
				pr = (PersonaReflection) c.newInstance(null);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}*/
		
		PersonaReflection pr = null;
		try
		{			
			pr = (PersonaReflection) PersonaReflection.class.getConstructors()[0].newInstance(null);
			pr.age = 1000;
			pr.name = "Pepe";
			pr.surname = "Pepon";
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
				
		System.out.println("-------------- ATRIBUTOS -------------------");
		Field [] fields = pr.getClass().getFields();
		for (Field field : fields) 
		{
			System.out.println(field.getName());
			try {
				System.out.println(field.get(pr));
				
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("-------------- METODOS -------------------");
		Method[] methods = pr.getClass().getMethods();
		for (Method m : methods) 
		{
			System.out.println(m.getName());
			
			if (m.getName().equals("setName"))
			{
				try 
				{
					m.invoke(pr, "Pepito");
					
					System.out.println("LUEGO DEL INVOKE ----> " + pr.getName());
					
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			
		}
		
		System.out.println("-------------- ATRIBUTOS PRIVADOS -------------------");
		Field [] privatesFields = pr.getClass().getDeclaredFields();
		for (Field field : privatesFields) 
		{
			System.out.println(field.getName());
		}
		
		System.out.println("-------------- METODOS PRIVADOS -------------------");
		Method[] privatesMethods = pr.getClass().getDeclaredMethods();
		for (Method m : privatesMethods) 
		{
			System.out.println(m.getName());
		}
		
	}

}

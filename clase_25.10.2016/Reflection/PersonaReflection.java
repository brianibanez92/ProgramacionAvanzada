package Reflection;

public class PersonaReflection 
{
	public String name;
	public String surname;
	public int age;
	private String apodo;
	private String mascota;
	
	public PersonaReflection()
	{
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getSurname()
	{
		return this.name;
	}
	
	public int getAge() throws Exception
	{
		return this.age;
	}
	
	private String getApodo()
	{
		return this.apodo;
	}
	
	private String getMascota()
	{
		return this.mascota;
	}

}

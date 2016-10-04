package Generics;

public class MyClase<T extends Number> {
	
	private T valor;

	public T get()
	{
		return this.valor;
	}
	
	public void set(T value)
	{
		this.valor = value;
	}
	
	
}

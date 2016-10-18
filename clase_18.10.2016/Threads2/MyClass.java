package Threads2;

public class MyClass implements Runnable {

	private String name;
	
	public MyClass(String name) 
	{
		this.name = name;
	}
	
	@Override
	public void run() 
	{
	
		for(int i = 0; i < 8; i++)
		{
			
			System.out.println(this.name + " --- " + i);
			
			// Forza al hilo a salir del estado de ejecucion, lo cual libera la cpu para que 
			// la use otro hilo.
			//Thread.yield();
			
		}
		
	}

	
}

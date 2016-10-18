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
	
		for(int i = 0; i < 6; i++)
		{
			
			System.out.println(this.name + " --- " + i);
		}
		
	}

	
}

package Threads_MetodosObject;

public class MyRunnable implements Runnable {

	private Thread hilo1;
	private Thread hilo2;
	
	public MyRunnable()
	{
	}
	
	@Override
	public void run() 
	{
		
		// Bloquea la instancia.
		synchronized (this) 
		{
			
			for (int i = 0; i < 5; i++) 
			{
				
				System.out.println(Thread.currentThread().getName() + " --- " + i);
				
				try 
				{
					if ("Hilo1".equals(Thread.currentThread().getName()) && i == 0)
					{
						this.wait();
					}
					
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				
			}
		}
		
	}
	
	public synchronized void retomar()
	{
		this.notify();
	}
	
	
}

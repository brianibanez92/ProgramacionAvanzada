package Thread_Sleep_Interrupt;

public class MiHilo implements Runnable {
	
	public MiHilo() 
	{
	}
	
	
	@Override
	public void run() 
	{
		
		try 
		{	
			
			for (int i = 0; i < 20; i++) {
				
				System.out.println(i + " --- " + Thread.currentThread().getName());
				Thread.sleep(1000);
				
			}
			
		} 
		catch (InterruptedException e1) 
		{
			// TODO Auto-generated catch block
			System.out.println(" Se interrumpio el hilo " + Thread.currentThread().getName());
		}
		
	}

}

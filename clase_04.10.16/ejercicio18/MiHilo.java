package ejercicio18;

public class MiHilo implements Runnable {
	
	public MiHilo() 
	{
	}
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 2000; i++) {
			
			System.out.println(i + " --- " + Thread.currentThread().getName());
			
		}
		
	}

}

package Ejercicio18;

public class MiHilo implements Runnable
{

	@Override
	public void run() 
	{
		for (int i = 0; i < 20; i++) {
			
			try 
			{
				
				Thread.sleep(100);
				
				if(Thread.currentThread().getName() == "Hilo1")
				{
					// El Hilo pasa a estado "ejecutable" para ceder
					// la ejecucion a otro hilo.
					Thread.yield();
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " --- " + Thread.currentThread().getName());
			
		}
	}
}

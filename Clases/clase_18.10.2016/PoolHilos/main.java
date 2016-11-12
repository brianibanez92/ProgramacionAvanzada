package PoolHilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) 
	{
		
		// Solo ejecuta de a la cantidad que se le pasa por parametro.
		// Cuando finaliza algun especio recien ejecuta los que estan en la cola de espera.
		ExecutorService es = Executors.newFixedThreadPool(5);
		 
		for (int i = 0; i < 100; i++) 
		{
		
			es.execute(new Runnable(){
				
				private int indiceHilo = 0;
				
				@Override
				public void run() {
					
					
					System.out.println(Thread.currentThread().getName() + " --- " + indiceHilo);
					indiceHilo++;
					
				}
				
			});
			
			
		}
		
		// método shutdown() de la Thread Pool. Con esta llamada indicamos que, una vez se hayan 
		// ejecutado todos los hilos, habremos acabado con nuestro trabajo.
		es.shutdown();
		
		
		
		/* El método awaitTermination detiene la 
		ejecución del programa hasta que haya acabado todo el trabajo o hasta que se sobrepase el 
		número de segundos de espera que se pasan como argumento. En el caso de que el trabajo se 
		finalice en el tiempo especificado, el método devolverá true, indicando que todo ha ido bien. Si 
		se sobrepasa el tiempo, devolverá false, lo que nos indicará que posiblemente tengamos algún 
		problema en la ejecución de algún hilo, ya que la ThreadPool no ha terminado su ejecución en  el tiempo esperado */
		try {
			boolean flag = es.awaitTermination(50, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

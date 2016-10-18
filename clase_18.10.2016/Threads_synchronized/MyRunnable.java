package Threads_synchronized;

public class MyRunnable implements Runnable {

	/*@Override
	public void run() {
		
		// Sincronizacion a nivel bloques.
		synchronized (this) {
			
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " --- " + i);
			}
		}
		
		System.out.println("HOLA SOY" + " ------ " + Thread.currentThread().getName());

		
	}*/
	
	@Override
	public void run() {
		
		saludar();
		
	}
	
	// Sincronizacion a nivel metodo.
	public synchronized void saludar()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " --- " + i);
		}
		
	}
	
}

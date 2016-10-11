package Threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
									
			System.out.println(i + " - " + Thread.currentThread().getName());

			// El flag de interrupción ha sido activado
			if (Thread.interrupted()) {
				System.out.println("SE INTERRUMPIO EL HILO --- " + Thread.currentThread().getName());
				return;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				return;
			}
			
			
		}
		
	}
	
}

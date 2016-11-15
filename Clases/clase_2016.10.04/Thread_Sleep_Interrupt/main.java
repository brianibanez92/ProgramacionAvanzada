package Thread_Sleep_Interrupt;

public class main {

	public static void main(String[] args) 
	{
		
		MiHilo miHilo1 = new MiHilo();
		MiHilo miHilo2 = new MiHilo();
		MiHilo miHilo3 = new MiHilo();
		
		Thread thread1 = new Thread(miHilo1, "Hilo 1");
		Thread thread2 = new Thread(miHilo2, "Hilo 2");
		Thread thread3 = new Thread(miHilo3, "Hilo 3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		thread1.interrupt();
		
		
	}

}

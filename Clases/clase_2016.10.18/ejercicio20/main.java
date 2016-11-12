package ejercicio20;

public class main {

	public static void main(String[] args) 
	{

		TomarPalabra runnable = new TomarPalabra();
		
		Thread t1 = new Thread(runnable, "Hilo1");
		Thread t2 = new Thread(runnable, "Hilo2");
		Thread t3 = new Thread(runnable, "Hilo3");
		Thread t4 = new Thread(runnable, "Hilo4");
		Thread t5 = new Thread(runnable, "Hilo5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	}

}

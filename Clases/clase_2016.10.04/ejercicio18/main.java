package ejercicio18;

public class main {

	public static void main(String[] args) {
		
		// 18. Crear una clase llamada mi hilo que implemente la runnable. En el método run creo un for 
		// de dos mil iteraciones que muestren por consola el número de iteración y el nombre del hilo.
		// Generar un test que cree 3 hilos, los ejecute y muestre un mensaje cuando todos los hilos finalicen.
		
		MiHilo miHilo1 = new MiHilo();
		MiHilo miHilo2 = new MiHilo();
		MiHilo miHilo3 = new MiHilo();
		
		Thread thread1 = new Thread(miHilo1);
		Thread thread2 = new Thread(miHilo2);
		Thread thread3 = new Thread(miHilo3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		try {			
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

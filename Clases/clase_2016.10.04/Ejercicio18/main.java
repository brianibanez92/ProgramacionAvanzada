package Ejercicio18;

public class main {

	public static void main(String[] args) throws InterruptedException 
	{
		// 18. Crear una clase llamada mi hilo que implemente la runnable. En el método run 
		// creo un for de dos mil iteraciones que muestren por consola el número de 
		// iteración y el nombre del hilo. Generar un test que cree 3 hilos, los ejecute y 
		// muestre un mensaje cuando todos los hilos finalicen.
		
		MiHilo h1 = new MiHilo();
		MiHilo h2 = new MiHilo();
		MiHilo h3 = new MiHilo();
		
		Thread t1 = new Thread(h1, "Hilo1");
		Thread t2 = new Thread(h2, "Hilo2");
		Thread t3 = new Thread(h3, "Hilo3");
		
		// Utilizo el metodo Join, este hace que el Hilo Actual, osea el que ejecuta el main
		// espere a que muera el Hilo que llamo al metodo "Join", en estos casos cada hilo llama al join
		// por lo que el Hilo principal debe esperar a que mueran cada uno de estos hilos.
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
		//t1.start();
		//t2.start();
		//t3.start();
		
		System.out.println("Finalizaron todos los hilos");
		

	}

}

package ejemplos.ciclo_de_vida.interrupcion;

import ejemplos.ciclo_de_vida.MiHilo;
import ejemplos.ciclo_de_vida.MiHiloConSleep;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread h1=new Thread(new MiHiloConSleep("Hilo1"));
		Thread h2=new Thread(new MiHilo("Hilo2"));
		h1.start();
		
		h2.start();
		
		h2.interrupt();
	}
}

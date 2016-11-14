package ejemplos.join;

import ejemplos.ciclo_de_vida.MiHilo;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread h1=new Thread(new MiHilo("HiloA"));
		Thread h2=new Thread(new MiHilo("HiloB"));
		Thread h3=new Thread(new MiHilo());
		try {
			h1.start();
			h1.join();
			h2.start();
			h2.join();
			h3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

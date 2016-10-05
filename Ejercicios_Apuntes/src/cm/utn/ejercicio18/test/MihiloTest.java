package cm.utn.ejercicio18.test;

import org.junit.Test;

import cm.utn.ejercicio18.Mihilo;

public class MihiloTest {

	@Test
	public void test() {
		Thread t1=new Thread(new Mihilo(), "Hilo_1");
		Thread t2=new Thread(new Mihilo(), "Hilo_2");
		Thread t3=new Thread(new Mihilo(), "Hilo_3");
		while(t1.isAlive() && t2.isAlive() && t3.isAlive()){
			t1.start();
			t2.start();
			t3.start();
		}
		System.out.println("Fin...");
	}

}

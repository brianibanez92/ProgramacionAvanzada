package utn.com.clases;

import java.util.HashSet;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		ClaseTheard hilo=new ClaseTheard();
		Thread t1=new Thread(hilo,"Hilo-1");
		//Thread t2=new Thread(hilo,"Hilo-2");
		//Thread t3=new Thread(hilo,"Hilo-3");
		
		/*t1.start();
		t1.join();
		t2.start();
		t2.join();
		Thread.yield();
		t2.start();*/
		
		t1.start();
		t1.sleep(20);
		hilo.retomar();
		
		
	
	}

}

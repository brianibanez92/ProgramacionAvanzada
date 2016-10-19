package utn.com.clases;

import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	/*t1.start();
	t1.join();
	t2.start();
	t2.join();
	Thread.yield();
	t2.start();*/
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		/*ClaseTheard hilo=new ClaseTheard();
		Thread t1=new Thread(hilo,"Hilo-1");
		
		t1.start();
		t1.sleep(20);
		hilo.retomar();*/
		
		ExecutorService ex=Executors.newFixedThreadPool(5);
		for(int i=0;i<100;i++){
			ex.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("hola");
				}
			});
		}
	
	}

}

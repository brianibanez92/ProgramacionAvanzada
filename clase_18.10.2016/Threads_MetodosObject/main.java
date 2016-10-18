package Threads_MetodosObject;

public class main {

	public static void main(String[] args) {
		
		MyRunnable run = new MyRunnable();
		
		Thread t1 = new Thread(run, "Hilo1");
		Thread t2 = new Thread(run, "Hilo2");
		Thread t3 = new Thread(run, "Hilo3");

		t1.start();
		t2.start();
		t3.start();

		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		run.retomar();
		
	}

}

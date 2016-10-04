package Threads;

public class main {

	public static void main(String[] args) {
		
		//MyThread myThread = new MyThread();
		//myThread.start();
				
		MyRunnable myRunnable = new MyRunnable();
		
		Thread thread1 = new Thread(myRunnable);
		Thread thread2 = new Thread(myRunnable);
		
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();
		thread2.start();
		
		System.out.println("Fin");
		
		
		
		

	}

}

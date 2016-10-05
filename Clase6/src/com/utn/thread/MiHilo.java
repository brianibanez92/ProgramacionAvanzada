package com.utn.thread;

public class MiHilo  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			System.out.println(i+" - "+Thread.currentThread().getName());
			if(Thread.interrupted()){
				return;
			}
		}
	}

}

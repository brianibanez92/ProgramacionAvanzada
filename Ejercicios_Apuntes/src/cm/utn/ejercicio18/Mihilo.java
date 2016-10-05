package cm.utn.ejercicio18;

public class Mihilo implements Runnable {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.println("Iteracion: "+i +" - "+Thread.currentThread().getName());
		}
	}

}

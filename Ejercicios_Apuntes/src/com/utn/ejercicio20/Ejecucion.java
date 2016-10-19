package com.utn.ejercicio20;

enum IEstado{
	inicializado,
	detenido,
	frenado,
	reanudado
}
public class Ejecucion implements Runnable {

	public IEstado estado=IEstado.inicializado;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println(i);
			if(i==3){
				this.frenar();
			}
	}
	}
	public synchronized void detener(){
		estado=IEstado.detenido;
		System.out.println(estado.toString());
		if(Thread.interrupted()){
			return;
		}
	}
	public synchronized  void frenar(){
			estado=IEstado.frenado;
			System.out.println(estado.toString());
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public synchronized void reanudar(){
		estado=IEstado.reanudado;
		System.out.println(estado.toString());
		this.notify();
	}

}

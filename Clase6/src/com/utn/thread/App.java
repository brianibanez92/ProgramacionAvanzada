package com.utn.thread;

public class App {
	//hilo=processo=Thread 
	//El hilo muere con en el momento que termina el metodo run del Thread 
	//cada proceso(Thread) tiene una unica instancia, y solo se puede ejecutar una sola vez
	//Ciclo de vida de hilos=Nuevo-En Ejecucion-Terminacion
	//Hay dos formas de utilizar hilos: 1_Heredando de la clase Thread y otro que implemente de la interfaz Runnable pasandole por parametro a una instancia de tread
	//t.isAlive();
	public static void main(String[] args) {
		
		MiHilo miHilo=new MiHilo();
		Thread t=new Thread(miHilo,"Hilo-1");
		Thread t2=new Thread(miHilo,"Hilo-2");
		
		t.setPriority(10);
		t.setPriority(1);
	
		t.start();
		t2.start();
		
	}

}

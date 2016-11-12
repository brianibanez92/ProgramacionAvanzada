package ejercicio20;

import java.util.ArrayList;
import java.util.List;

public class TomarPalabra implements Runnable {

	private List<String> palabras;
	
	public TomarPalabra() 
	{
		this.palabras = new ArrayList<String>();
		this.palabras.add("hola");
		this.palabras.add("mundo");
		this.palabras.add("adios");
		this.palabras.add("pepe");
		this.palabras.add("camina");
		this.palabras.add("duerme");
		this.palabras.add("siempre");
		this.palabras.add("agua");
		this.palabras.add("tierra");
		this.palabras.add("programacion");
		this.palabras.add("nada");
	}
	
	@Override
	public void run() {
		
		System.out.println("Soy el " + Thread.currentThread().getName() + " ---- MI PALABRA ES: " + this.tomarPalabra());
		
	}
	
	public synchronized String tomarPalabra()
	{
		// Obtengo alguna palabra de la lista.
		String palabra = this.palabras.stream().findAny().get();
		
		// Elimino la palabra de la lista.
		this.palabras.remove(palabra);
		
		return palabra;
	}
	
}

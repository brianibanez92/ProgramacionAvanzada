package ejercicio21;

import java.util.ArrayList;
import java.util.List;

public class TomarPalabra21 implements Runnable {

	private List<String> palabras;
	
	public TomarPalabra21() 
	{
		this.palabras = new ArrayList<String>();
	}
	
	@Override
	public void run() {
		
		if (this.palabras.size() == 0)
		{
			try 
			{
				this.wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
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
	
	public synchronized void AgregarPalabra(String palabra)
	{
		this.palabras.add(palabra);
		this.notify();
	}
	
}


package ejercicio21;

import java.util.ArrayList;
import java.util.List;

public class AgregarPalabra implements Runnable 
{

	private List<String> palabras;
	private TomarPalabra21 tomarPalabra;
	
	public AgregarPalabra(TomarPalabra21 tomarPalabra) 
	{
		this.tomarPalabra = tomarPalabra;
		
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
	public void run() 
	{
	
		for (int i = 0; i < 10; i++) {
			
			try 
			{
				
				Thread.sleep(100000);
				
				
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
}

package Excepciones;

public class Main {

	public static void main(String[] args) {
		
		ManejoExcepciones me = new ManejoExcepciones();
		
		try 
		{
			me.Metodo1();
			
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		//me.Metodo2();
		/*
		try 
		{
			me.Metodo2();
			
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		 	*/
		
		
	}

}

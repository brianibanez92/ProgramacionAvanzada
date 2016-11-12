package Excepciones;

public class Main {

	public static void main(String[] args) throws Throwable {
		
		ManejoExcepciones me = new ManejoExcepciones();
		
		me.Metodo2();
		
		
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

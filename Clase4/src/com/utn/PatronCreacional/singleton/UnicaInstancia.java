package com.utn.PatronCreacional.singleton;

public class UnicaInstancia {
	private static UnicaInstancia instancia;
	private static boolean estadoClase;
	
	private UnicaInstancia(){}
	
	public static UnicaInstancia get(boolean estado)
	{
		if(instancia==null){
			instancia=new UnicaInstancia();
			estadoClase=estado;
		}
		return instancia;
	}

	public String toString(){
		return "Estado clase: "+estadoClase;
	}
	
	

}

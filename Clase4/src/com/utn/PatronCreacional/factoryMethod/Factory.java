package com.utn.PatronCreacional.factoryMethod;

//Fabrica=Encargada de crear objeto especifico.
public class Factory {
	public static ClasePadre get(int i)
	{
		ClasePadre clase = null;
		switch(i){
		case 1:
			clase=new ClaseHija1();
			break;
		case 2:
			clase=new ClaseHija2();
			break;
		case 3:
			clase=new ClaseHija3();
			break;
		}
		return clase;
	}
}

package com.utn.PatronCreacional.factoryMethod;

public class Main {

	public static void main(String[] args) {
		ClasePadre clase=Factory.get(2);
		System.out.println(clase.mensaje());
	}

}

package com.utn.PatronCreacional.singleton;

public class Main {

	public static void main(String[] args) {
		UnicaInstancia instancia=UnicaInstancia.get(false);
		System.out.println(instancia.toString());
	}

}

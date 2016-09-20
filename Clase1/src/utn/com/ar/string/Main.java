package utn.com.ar.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws StringException {
		System.out.println ("Por favor introduzca una cadena por teclado:");
		
		@SuppressWarnings("resource")
		Scanner entradaEscaner = new Scanner (System.in);
		String msg=entradaEscaner.nextLine (); ;
		
		System.out.println("Cantidad Caracteres: "+ClaseString.getCantidadCaracteres(msg));
		System.out.println("Mitad de Caracteres: "+ClaseString.getMitadCaracteres(msg));
		System.out.println("Ultimo Caracter: "+ClaseString.getUltimoCaracter(msg));
		System.out.println("Inversa Caracteres: "+ClaseString.getInversaCaracteres(msg));
		System.out.println("Guion Caracteres: "+ClaseString.getGuionCaracteres(msg));
		System.out.println("Comparador Hola: "+ClaseString.getComparadorHola(msg));
	}

}

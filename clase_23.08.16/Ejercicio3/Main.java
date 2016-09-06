package Ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        System.out.println ("Por favor introduzca una cadena por teclado:");

        Scanner escaner = new Scanner (System.in);        
        String entradaTeclado = escaner.nextLine (); 
        escaner.close();
        
        ManejadorString mnj = new ManejadorString();
        
        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado + "\" \n");
        System.out.println ("Imprimir la cantidad de caracteres que posee:"  + mnj.imprCantidadCaracteres(entradaTeclado));
        System.out.println ("Imprimir la primera mitad de los caracteres de la cadena: " + mnj.imprPrimerMitad(entradaTeclado));
        System.out.println("Imprimir el último caracter: " + mnj.imprUltimoCaracter(entradaTeclado));
        System.out.println("Imprimirlo en forma inversa: " + mnj.imprFormaInversa(entradaTeclado));
        System.out.println("Imprimir cada caracter del String separado con un guión: " + mnj.imprCaracteresGuion(entradaTeclado));
        System.out.println("Implementar un método que verifique si la cadena posee la palabra 'hola' : " + mnj.verificarPalabraHola(entradaTeclado));
        
	}

}

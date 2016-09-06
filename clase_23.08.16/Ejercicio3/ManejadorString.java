package Ejercicio3;

public class ManejadorString {
	
	// Imprimir la cantidad de caracteres que posee.
	public int imprCantidadCaracteres(String cadena)
	{
		return cadena.length();
	}
	
	// Imprimir la primera mitad de los caracteres de la cadena
	public String imprPrimerMitad(String cadena)
	{
		return cadena.substring(0, cadena.length() / 2);
	}
	
	// Imprimir el último caracter.
	public Character imprUltimoCaracter(String cadena)
	{
		return cadena.charAt(cadena.length() - 1);
	}
	
	// Imprimirlo en forma inversa.
	public String imprFormaInversa(String cadena)
	{
		String strInverso = "";
		
		for (int i = cadena.length(); i > 0; i--) {
			strInverso = strInverso + cadena.charAt(i -1);
		}
		
		return strInverso;
	}
	
	// Imprimir cada caracter del String separado con un guión.
	public String imprCaracteresGuion(String cadena)
	{
		String guiones = "";
		for (int i = 0; i < cadena.length(); i++) {
			guiones =  guiones + cadena.charAt(i) + "-";
		}
		
		return guiones;
	}
	
	// Implementar un método que verifique si la cadena posee la palabra “hola”
	// (indistintamente si posee letras mayúsculas o minúsculas)
	public String verificarPalabraHola(String cadena)
	{
		cadena = cadena.toLowerCase();
		return ((Boolean)cadena.contains("hola".toLowerCase())).toString();
	}
	
	
}

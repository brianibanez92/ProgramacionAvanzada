package Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		
		
		// Se definen todos los recursos en el try aquellos que implementen la interfaz "Closeable"
		// lo cual hace es que cuando se salga del try (ya sea por el catch o por ejecucion normal) 
		// se ejecute el metodo close() que esta declarado en la interfaz "Closeable"
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Archivos\\texto.txt"))))
		{
			bw.write("Hola pepe		11111	");
			
			//El buffer solo llama a Writer cuando se llena, por eso forzamos la escritura con el flush
			bw.flush();
			
		} 
		catch (Exception e) 
		{
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("Archivos\\texto.txt")))) 
		{
			
			String linea;
			while ((linea = br.readLine()) != null) {
				
				System.out.println(linea);
				
			}
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}

	}

}

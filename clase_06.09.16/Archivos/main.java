package Archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		
		FileWriter fw; 
		BufferedWriter bw = null;
		
		try 
		{
			File f = new File("Archivos\\texto.txt");
			
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			bw.write("Hola pepe		asdasdasd	");
			
			//El buffer solo llama a Writer cuando se llena, por eso forzamos la escritura con el flush
			bw.flush();
			
			
		} catch (Exception e) 
		{
		}
		finally
		{
			//Se cierra la escritura del archivo.
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

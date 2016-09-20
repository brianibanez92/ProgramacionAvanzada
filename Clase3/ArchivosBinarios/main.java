package ArchivosBinarios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int size = 100;
		byte[] bytes = new byte[size];
		
		File origen = new File("clase_06.09.16\\ArchivosBinarios\\WildCard.pdf");
		File destino = new File("clase_06.09.16\\ArchivosBinarios\\Destino_WildCard.pdf");
		try(
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origen));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destino))
			) 
		{
		
			int lenth = 0;
			
			// Devuelve -1 cuando no hay mas bytes por leer.
			while ((lenth = bis.read(bytes, 0, size)) > -1) 
			{
				bos.write(bytes, 0, lenth);
			}
			
		} catch (Exception e) 
		{
		}
				
		
	}

}

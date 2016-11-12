package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Ejercicio3.ManejadorString;

public class ManejadorStringTest {

	ManejadorString ms;
	
	@Before
	public void setUp() throws Exception {
		
		ms = new ManejadorString();
		
	}

	@Test
	public void TestcantidadCaracteres() {

		String cadena = "asd";
		Assert.assertEquals(ms.imprCantidadCaracteres(cadena), 3);
				
	}
	
	@Test(expected=Exception.class)
	public void TestcantidadCaracteresNull() 
	{
		try 
		{
			String cadena = null;
			Assert.assertEquals(ms.imprCantidadCaracteres(cadena), 3);
			
		} catch (Exception e) 
		{
			//Assert.fail("Fallo!!! : " + e.getMessage());
			throw e;
		}
		
	}

}

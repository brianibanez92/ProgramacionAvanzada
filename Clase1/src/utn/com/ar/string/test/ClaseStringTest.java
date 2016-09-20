package utn.com.ar.string.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import utn.com.ar.string.ClaseString;
import utn.com.ar.string.StringException;

public class ClaseStringTest {

	public static String msg;

	@BeforeClass
	public static void cargarTexto()
	{
		msg="Hola Mundo";
	}
	
	public void testGetCantidadCaracteres() {
		Assert.assertEquals(5, ClaseString.getCantidadCaracteres(msg));
	}

	@Test
	public void testGetMitadCaracteres(){
		try {
			Assert.assertEquals("Hola ",ClaseString.getMitadCaracteres(msg));
		} catch (StringException e) {
			Assert.fail();
		}
	}
	@Test
	public void testGetMitadCaracteresError() {
		msg="HolaMundo";
		try {
			ClaseString.getMitadCaracteres(msg);
			Assert.fail();
		} catch (StringException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void testGetUltimoCaracter() {
		Assert.assertEquals('o',ClaseString.getUltimoCaracter(msg));
	}

	@Test
	public void testGetInversaCaracteres() {
		Assert.assertEquals("odnuM aloH",ClaseString.getInversaCaracteres(msg));
	}

	@Test
	public void testGetGuionCaracteres() {
		Assert.assertEquals("H-o-l-a- -M-u-n-d-o",ClaseString.getGuionCaracteres(msg));
	}

	@Test
	public void testGetComparadorHola() {
		Assert.assertEquals(false,ClaseString.getComparadorHola(msg));
	}

}

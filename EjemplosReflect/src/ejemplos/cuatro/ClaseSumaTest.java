package ejemplos.cuatro;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ClaseSumaTest {

	@Test(expected=Exception.class)
	public void test() throws Exception{
		ClaseSuma.sumar(8,2);
	}

}

package com.utn.ejercicio20;


import org.junit.Assert;
import org.junit.Test;

public class EjecucionTest {

	@Test
	public void test() throws InterruptedException {
		Ejecucion ejecucion=new Ejecucion();
		Thread t=new Thread(ejecucion,"Hilo-1");
		t.start();
		t.sleep(100);
		ejecucion.reanudar();
		t.sleep(100);
		ejecucion.detener();
		Assert.assertEquals(ejecucion.estado, IEstado.detenido);
	}

}

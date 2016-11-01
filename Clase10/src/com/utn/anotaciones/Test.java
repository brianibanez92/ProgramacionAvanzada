package com.utn.anotaciones;
import static org.junit.Assert.*;

import org.junit.Ignore;


public class Test {
	
	
	@TestMio(cantidad = 10)
	public void metodoTest(){
		System.out.print("Test");
	}
	
	@Ignore
	public void metodoIgnore(){
		System.out.print("Ignore");
	}
}

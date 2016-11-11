package com.utn.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestMio{ 
	int cantidad();
	int cantidadDefault() default 1;
	String nombreDefault() default "Default";
}
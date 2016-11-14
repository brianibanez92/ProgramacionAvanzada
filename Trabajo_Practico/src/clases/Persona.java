package clases;

import anotaciones.Columna;
import anotaciones.Tabla;

@Tabla(nombre="USERS")
public class Persona {

	@Columna
	private String name;
	
	@Columna
	private String lastName;
	
	@Columna
	private String document;
	
	public Persona(String lastName, String name, String document) {
		super();
		this.lastName = lastName;
		this.name = name;
		this.document = document;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}
}

package Collections;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
		
		Set<Persona> personas = new HashSet<Persona>();
		
		Persona p1 = new Persona();
		p1.setApellido("Perez");
		p1.setNombre("Armando");
		
		Persona p2 = new Persona();
		p2.setApellido("Perez");
		p2.setNombre("Armando");
		
		personas.add(p1);
		personas.add(p2);
		
		for (Persona p : personas) 
		{
			System.out.println(p.getApellido() + ", " + p.getNombre());
		}
		
		System.out.println(personas.size());
		
		System.out.println(p1.equals(p2));
		
		
		
		
		
	}

}

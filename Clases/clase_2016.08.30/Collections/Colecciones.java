package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Colecciones {

	public static void main(String[] args) {
		
		Collection<Persona> pppp = new ArrayList<>();
		
		Set<Persona> personas = new HashSet<Persona>();
		Set<Persona> per22 = new TreeSet<Persona>();
		
		List<Persona> per2 = new LinkedList<Persona>();
		List<Persona> per33 = new ArrayList<Persona>();
		List<Persona> per333 = new Vector<Persona>();
		
		Queue<Persona> per = new LinkedList<Persona>();
		Queue<Persona> per11 = new PriorityQueue<Persona>();
		
					
		Map<String,Persona> mapp = new HashMap<String, Persona>();
		Map<String,Persona> mappp = new TreeMap<String,Persona>();
		Map<String,Persona> mapppp = new Hashtable<String,Persona>();
		
		
		
		
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

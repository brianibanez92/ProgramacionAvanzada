package ar.com.utn.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Persona p1=new Persona("Julian", "Moreno");
		Persona p2=new Persona("Julian", "Moreno");
		Set<Persona> ls=new HashSet<Persona>();
		ls.add(p1);
		ls.add(p2);
		System.out.println("Elemento de la lista Set:"+ls.size());
		
		Map<Integer,Persona> lsMap=new HashMap<Integer,Persona>();
		lsMap.put(1, p1);
		lsMap.put(1, p2);
		System.out.println("Elemento de la lista Set:"+lsMap.size());
	}

}

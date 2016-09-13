package Patrones;

public class main {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.get();
		Singleton s2 = Singleton.get();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		

	}

}

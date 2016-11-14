package ejemplos.conexion;


public class App {

	public static void main(String[] args) {
	    DBORACLE db = new DBORACLE().conectar();
	    db.ejecutar("INSERT INTO USERS(NAME,LASTNAME,DOCUMENT) VALUES('JULIAN','MORENO','37659989')");
		
	}

}

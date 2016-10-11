package Facade;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 		FachadaImpresoraNormal fachada1= new FachadaImpresoraNormal("texto1");
	 		fachada1.imprimir();
	 		
	 		FachadaImpresoraNormal fachada2= new FachadaImpresoraNormal("texto2");
	 		fachada2.imprimir();

	 		Impresora i3 = new Impresora();
	 		i3.setHoja("a4");
	 		i3.setColor(true);
	 		i3.setTipoDocumento("excel");
	 		i3.setTexto("texto 3");
	 		i3.imprimirDocumento();
	 		

	}

}

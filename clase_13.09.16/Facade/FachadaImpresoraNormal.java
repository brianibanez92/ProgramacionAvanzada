package Facade;

public class FachadaImpresoraNormal {

		Impresora impresora;

		public FachadaImpresoraNormal(String texto) {
			
		 		super();
		 		impresora= new Impresora();
		 		impresora.setColor(true);
		 		impresora.setHoja("A4");
		 		impresora.setTipoDocumento("PDF");
		 		impresora.setTexto(texto);
		 }

		public void imprimir() {
			
		 		impresora.imprimirDocumento();
		 }
}

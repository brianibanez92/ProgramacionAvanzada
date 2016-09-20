package utn.com.ar.string;

public class ClaseString {
	public static int  getCantidadCaracteres(String msg){return msg.length();}
	public static String  getMitadCaracteres(String msg)throws StringException{
		if(msg.length() % 2>0)
		{
			throw new StringException("Error Mensaje Impar");
		}
		return msg.substring(0, msg.length()/2);
		}
	public static char  getUltimoCaracter(String msg){return msg.charAt(msg.length()-1);}
	public static String  getInversaCaracteres(String msg){return new StringBuilder(msg).reverse().toString();}
	public static String  getGuionCaracteres(String msg){
		StringBuilder sb=new StringBuilder();
		msg.chars().forEach(s->{sb.append((char)s); sb.append('-');});
		return sb.toString().substring(0,sb.length()-1);}
	public static boolean  getComparadorHola(String msg){return "HOLA".equals(msg.toUpperCase());}
}

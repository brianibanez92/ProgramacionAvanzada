package ejemplos.cuatro;

public class ClaseSuma {
	public static int sumar(int num1,int num2) throws Exception{
		int sum=num1+num2;
		if(sum<0){
			throw new Exception("Error");
		}
		return num1+num2;
	}
}

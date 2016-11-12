package properties;

import java.util.ResourceBundle;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResourceBundle rb = ResourceBundle.getBundle("properties/archivo");
		
		System.out.println(rb.getString("user"));
		System.out.println(rb.getString("pass"));
		System.out.println(rb.getString("url"));
	}

}

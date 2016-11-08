package com.utn.classes;

import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle rb= ResourceBundle.getBundle("archivo");
		String user=rb.getString("user");
		String pass=rb.getString("pass");
		String url=rb.getString("url");
		String driver=rb.getString("driver");
		
		System.out.println(user);
		System.out.println(pass);
		System.out.println(url);
		System.out.println(driver);
	}

}

package com.myProject;

import java.util.ResourceBundle;

public class App {

	
		// TODO Auto-generated method stub
		//System.out.print("MAven Project");
		
		
		public int User_Login(String uname, String pass) {
			ResourceBundle rb=ResourceBundle.getBundle("config");
			String u_name=rb.getString("username");
			String password=rb.getString("password");
			
			if(uname.equals(u_name) && pass.equals(password))
				return 1;
			else
				return 0;
		}
	

}

package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.*;
/*
*@ AUTHOR greeshma
*/
public class AdministrationController
{
	AdministrationView administrationV=new 	AdministrationView();
	
	
	public void loginValidation(String userName,String password)
	{
	
     if(userName.equals("manager"))
	   {
		   if(password.equals("manager"))
		   {
			   
		   }
		   else
		   {
			   System.out.println("Password incorrect");
		   }
	   }
	 else if(userName.equals("user"))
	   {
			if(password.equals("user"))
			{
				
			}
			else
			{
				System.out.println("password is incorrect");
			}
	   }
	   else
	   {
		   System.out.println("Username incorrect");
	   }
	   
	}
}
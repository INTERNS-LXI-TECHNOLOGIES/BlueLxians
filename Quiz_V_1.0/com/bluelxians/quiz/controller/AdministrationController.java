package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.*;
/*
*@ AUTHOR greeshma
*/
public class AdministrationController
{
	AdministrationView administrationV=new 	AdministrationView();
	ManagerController managerC=new ManagerController();
	UserController userC=new UserController();
	
	public void loginValidation(String userName,String password)
	{
	
     if(userName.equals("manager"))
	   {
		   if(password.equals("manager"))
		   {
			   managerC.managerOptions();
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
				userC.logedUser();
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
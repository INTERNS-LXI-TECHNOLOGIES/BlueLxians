package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.*;
import com.bluelxians.quiz.model.Quiz;
import java.util.ArrayList;
/*
*@ AUTHOR greeshma
*/
public class AdministrationController
{
	AdministrationView administrationV=new 	AdministrationView();
	ManagerController managerC=new ManagerController();

	UserController userC=new UserController();
    ArrayList <Quiz> quizes=new ArrayList <Quiz> ();
	public void loginValidation(String userName,String password)
	{
	
     if(userName.equals("manager"))
	   {
		   if(password.equals("manager"))
		   {

			   managerC.managerOptions(quizes);

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
				userC.quizChoice();
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
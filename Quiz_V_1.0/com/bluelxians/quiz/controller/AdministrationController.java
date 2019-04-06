package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.*;
import com.bluelxians.quiz.model.Quiz;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
/**
*@author greeshma
**/
public class AdministrationController
{
	AdministrationView administrationV=new 	AdministrationView();
	ManagerController managerC=new ManagerController();
	UserController userC=new UserController();
    ArrayList <Quiz> quizes=new ArrayList <Quiz> ();
	
	public void loginValidation(String userName,String password)throws Exception
	{
	Properties properties=new Properties();
	FileReader f = new FileReader("prop.properties");
	properties.load(f);
     if(userName.equals((properties.getProperty("managerUserName"))))
	   {
		   if(password.equals((properties.getProperty("managerPassword"))))
		   {

			   managerC.managerOptions(quizes);

		   }
		   else
		   {
			   System.out.println("Password incorrect");
		   }
	   }
	 else if(userName.equals(properties.getProperty("userName")))
	   {
			if(password.equals(properties.getProperty("password")))
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
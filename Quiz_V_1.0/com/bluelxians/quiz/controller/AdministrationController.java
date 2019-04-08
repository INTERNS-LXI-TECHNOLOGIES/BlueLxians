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
	Quiz quiz;
	public void loginValidation(String userName,String password)throws Exception
	{
	FileWriter w=new FileWriter("prop.properties");
	FileReader r= new FileReader("prop.properties");
	Properties p=new Properties();
	p.setProperty("managerUserName","manager");
	p.setProperty("managerPassword","manager");
	p.setProperty("userUserName","user");
	p.setProperty("userPassword","user");
	p.store(w,"java");
	p.load(r);
     if(userName.equals(p.getProperty("managerUserName")))
	   {
		   if(password.equals(p.getProperty("managerPassword")))
		   {

			   managerC.managerOptions(quizes,quiz);

		   }
		   else
		   {
			   System.out.println("Password incorrect");
		   }
	   }
	 else if(userName.equals(p.getProperty("userUserName")))
	   {
			if(password.equals(p.getProperty("userPassword")))
			{
				//userC.quizChoice();
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
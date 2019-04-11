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
		FileWriter w=new FileWriter("prop.properties",true);
	FileReader r= new FileReader("prop.properties");
	Properties p=new Properties();
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
	 	else if(userName.equals(p.getProperty("UserName")))
		{
			if(password.equals(p.getProperty("Password")))
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
public void registrationDetails(String userName,String password)throws Exception
{
		FileWriter w=new FileWriter("prop.properties",true);
		FileReader r= new FileReader("prop.properties");
		Properties p=new Properties();
	    p.setProperty("managerUserName","manager");
		p.setProperty("managerPassword","manager");
		p.setProperty("UserName",userName);
		p.setProperty("Password",password);
		p.store(w,"java projects");
}
}
package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.*;
import com.bluelxians.quiz.model.Quiz;
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
	 	else 
		{
		for(int c=1;c<50;c++)
		{
		if(userName.equals(p.getProperty("UserName"+c)))
		{
			if(password.equals(p.getProperty("Password"+c)))
				{
					userC.quizChoice();
				}
			else
			{
				System.out.println("username or password is incorrect");
			}
	    }
		}
	}
}
public void registrationDetails(String userName,String password)throws Exception
{
		FileWriter w=new FileWriter("prop.properties",true);
		FileReader r= new FileReader("prop.properties");
		BufferedReader br=new BufferedReader(r);
		Properties p=new Properties();
		//p.load(new FileReader("prop.properties"));
		int count=0;
		while(br.readLine()!=null)
		{
		count++;
		System.out.println(count);
		}
		int c=(count-2)/4;
		p.setProperty("UserName"+(c+1),userName);
		p.setProperty("Password"+(c+1),password);
		p.store(w,"java projects");	
		w.close();
}
}
package com.bluelxians.quiz.view;
import com.bluelxians.quiz.controller.*;
/**
*@author greeshma
**/
import java.util.Scanner;
public class AdministrationView
{
	  
		 
	Scanner scan=new Scanner(System.in);
     public void login()throws Exception
     {
		 
		 AdministrationController administrationC = new AdministrationController();
	     System.out.println("Login");
		 System.out.print("User name:");
		 String userName=scan.next();
         System.out.print("Password:");
         String password=scan.next();
         administrationC.loginValidation(userName,password);
       		 
		 
	 }	 
	 
}
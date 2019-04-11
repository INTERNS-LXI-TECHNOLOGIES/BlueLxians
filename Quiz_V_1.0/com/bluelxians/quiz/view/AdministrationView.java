package com.bluelxians.quiz.view;
import com.bluelxians.quiz.controller.*;
import java.util.*;
/**
*@author greeshma
**/
public class AdministrationView
{
	Scanner scan=new Scanner(System.in);
     public void login()throws Exception
     	{
		 do
		 {
		    AdministrationController administrationC = new AdministrationController();
	     	System.out.println("1.Login");
			System.out.println("2.Register");
			switch(scan.nextInt())
			{
				case 1:
				System.out.print("EmailId:");
				String emailId=scan.next();
				System.out.print("Password:");
				String password=scan.next();
				administrationC.loginValidation(emailId,password);
				break;
				case 2:
				System.out.print("EmailId:");
				emailId=scan.next();
				System.out.print("Password:");
				password=scan.next();
				administrationC.registrationDetails(emailId,password);
				//System.out.println("registration successful");
				break;
				default :
					System.out.println("wrong choice");
				break;
      	    }
         System.out.println("previous menu press 1");
         }
         while(scan.nextInt()==1);		 
      }
}
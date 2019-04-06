package com.bluelxians.quiz.view;
import com.bluelxians.quiz.controller.*;
import java.util.*;
/*
@Sarath Kumar S
*/
public class UserView
{
	int quizChoice;
	Scanner scan=new Scanner(System.in);
	public int logedUser()
	{
		System.out.println("Welcome To Quiz Contest");
		System.out.println("------------------------");
		System.out.println("Enter Your Choice");
		System.out.println("1.Java \n"+"2.C Programme \n"+"3.CPP");
		quizChoice=scan.nextInt();
		return quizChoice;
		//UserController userC=new UserController();
		//userC.quizChoice(quizChoice);
		
	}
}
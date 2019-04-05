package com.bluelxians.quiz.view;
/*
@Sarath Kumar S
*/
import com.bluelxians.quiz.controller.*;
import java.util.*;

public class UserLoged
{
	int quizChoice;
	Scanner scan=new Scanner(System.in);
	public void logedUser()
	{
		System.out.println("Welcome To Quiz Contest");
		System.out.print("Your Choices");
		System.out.print("1.Java \n"+"2.C Programe \n"+"3.CPP");
		System.out.print("Select a choice");
		quizChoice=scan.nextInt();
		QuizSegment segment = new QuizSegment();
		segment.quizChoice(quizChoice);

	}
}
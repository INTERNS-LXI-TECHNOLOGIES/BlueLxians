package com.bluelxians.quiz.view;
/**
*@author Pavana N P
**/
import java.util.Scanner;
public class QuizProgramView
{
	Scanner scan=new Scanner(System.in);
	public void quizOptions()
	{
		System.out.println("Quiz Program\n1.Java\n2.C\n3.C++");
		switch(scan.nextInt())
		{
			case 1:
			
			break;
			case 2:
			
			break;
			case 3:
			
			break;
			default:System.out.println("Wrong choice");
			break;
		}	
	}		
}
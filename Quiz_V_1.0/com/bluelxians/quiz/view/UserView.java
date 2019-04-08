package com.bluelxians.quiz.view;
import com.bluelxians.quiz.controller.*;
import com.bluelxians.quiz.model.Quiz;
import java.util.*;
/**
*@author Sarath Kumar S
**/
public class UserView
{
	int quizChoice;
	ManagerController managerC=new ManagerController();
	ArrayList <Quiz> quizes = new ArrayList <Quiz> ();
	Scanner scan=new Scanner(System.in);
	QuizProgramController quizProgramC =new QuizProgramController();
	String choice;

	public void logedUser()throws Exception
	{
		
		System.out.println("Welcome To Quiz Contest");
		System.out.println("------------------------");
		System.out.println("Select sessions\n1.java\n2.C\n3.C++");
		switch(scan.nextInt())
		{
			case 1 :sessionView();
					break;

			case 2 :
					break;

			case 3 :
					break;
			default:System.out.println("Invalid selection");
					break;
		}
		
	}
	public void sessionView()throws Exception
	{	
		
		managerC.readFromFile(quizes);

		for(int i=0;i<quizes.size();i++)
					{
						
						System.out.println((i+1)+". "+quizes.get(i).getQuestion()+"\n"+"a)."+quizes.get(i).getOptionA()+"\n"+"b)."+quizes.get(i).getOptionB()+"\n"+"c)."+quizes.get(i).getOptionC()+"\n"+"d)."+quizes.get(i).getOptionD());
						System.out.print("Enter your option:");
						choice=scan.next();
					}
		System.out.println("Session Completed.");
		int score=quizProgramC.checking(choice);
		System.out.println("Your Score is"+score);
	}


}
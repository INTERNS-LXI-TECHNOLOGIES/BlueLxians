package com.bluelxians.quiz.view;
import com.bluelxians.quiz.controller.ManagerController;
/**
*@author Pavana N P
**/
import java.util.Scanner;
public class ManagerView
{
	Scanner scan=new Scanner(System.in);
	ManagerController managerC;
	public void managerOperations()
	{
		managerC=new ManagerController();
		do
		{
		System.out.println("Operations\n1.Add\n2.Delete\n3.Update");
		switch(scan.nextInt())
		{
			case 1:
					System.out.println("Quiz");
					Quiz quiz=new Quiz();
					System.out.println("Question:");
					quiz.setQuestion(scan.next());
					System.out.println("Option a:");
					quiz.setOptionA(scan.next());
					System.out.println("Option b:");
					quiz.setOptionB(scan.next());
					System.out.println("Option c:");
					quiz.setOptionC(scan.next());
					System.out.println("Option d:");
					quiz.setOptionD(scan.next());
					System.out.println("Answer:");
					quiz.setAnswer(scan.next());
					managerC.addQuiz(quizes,quiz);
			break;
			case 2:
	
				
			break;
			case 3:
					
			default:System.out.println("Wrong choice");
			break;
		}
		
		System.out.println("Again do any operation press 1");
		}while(scan.nextInt()==1);
	}		
}
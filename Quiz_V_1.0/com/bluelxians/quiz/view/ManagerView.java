package com.bluelxians.quiz.view;
import com.bluelxians.quiz.controller.ManagerController;
import com.bluelxians.quiz.controller.QuizProgramController;
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
			managerC.quiz();
			break;
			case 2:
			managerC.quiz();
			break;
			case 3:
			managerC.quiz();
			break;
			default:System.out.println("Wrong choice");
			break;
		}
		
		System.out.println("Again do any operation press 1");
		}while(scan.nextInt()==1);
	}		
}
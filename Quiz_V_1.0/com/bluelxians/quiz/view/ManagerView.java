package com.bluelxians.quiz.view;
import com.bluelxians.quiz.controller.ManagerController;
import com.bluelxians.quiz.model.Quiz;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
/**
*@author Pavana N P
**/
public class ManagerView
{
	Scanner scan=new Scanner(System.in);
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r); 
	ManagerController managerC;
	public void managerOperations(ArrayList <Quiz> quizes,Quiz quiz)throws Exception
	{
		managerC=new ManagerController();
		do
		{
		System.out.println("Operations\n1.Add\n2.Delete\n3.Update\n");
		switch(scan.nextInt())
		{
			case 1:
			System.out.println("Select sessions\n1.java\n2.C\n3.C++");
			switch(scan.nextInt())
			{
				case 1:
					add(quizes,quiz);
				break;
				case 2:
					add(quizes,quiz);
				break;
				case 3:
					add(quizes,quiz);
				break;
				default:System.out.println("Wrong choice");
				break;
			}	
			break;
			case 2:
			System.out.println("Select sessions\n1.java\n2.C\n3.C++");
			switch(scan.nextInt())
			{
				case 1:
					delete(quizes);
				break;
				case 2:
					delete(quizes);
				break;
				case 3:
					delete(quizes);
				break;
				default:System.out.println("Wrong choice");
				break;
			}
			break;
			case 3:
			System.out.println("Select sessions\n1.java\n2.C\n3.C++");
			switch(scan.nextInt())
			{
				case 1:
					update(quizes);
				break;
				case 2:
					update(quizes);
				break;
				case 3:
					update(quizes);
				break;
				default:System.out.println("Wrong choice");
				break;
			}		
			break;	
			default:System.out.println("Wrong choice");
			break;
		}
		
		System.out.println("Again do any operation press 1");
		}while(scan.nextInt()==1);
	}
	public void add(ArrayList <Quiz> quizes,Quiz quiz)throws Exception
	{
		System.out.println("Quiz");
		quiz=new Quiz();
		do
		{
		System.out.print("Question:");
		quiz.setQuestion(br.readLine());
		System.out.print("Option a:");
		quiz.setOptionA(scan.next());
		System.out.print("Option b:");
		quiz.setOptionB(scan.next());
		System.out.print("Option c:");
		quiz.setOptionC(scan.next());
		System.out.print("Option d:");
		quiz.setOptionD(scan.next());
		System.out.print("Answer:");
		quiz.setAnswer(scan.next());
		managerC.addQuiz(quizes,quiz);
		System.out.println("To add questions again press 1");
		}while(scan.nextInt()==1);

		managerC.storeInFile(quizes);
		quizes.clear();
		managerC.readFromFile(quizes);
	}
	public void delete(ArrayList <Quiz> quizes)throws Exception
	{
		quizes.clear();
		do
			{
				managerC.readFromFile(quizes);
				System.out.print("Which question you want to delete:");
				String quesNo=scan.next();
				managerC.deleteQuiz(quesNo,quizes);
				System.out.println("To delete questions again press 1");
			}while(scan.nextInt()==1);

				managerC.storeInFile(quizes);
				quizes.clear();
				managerC.readFromFile(quizes);
	}
	public void update(ArrayList <Quiz> quizes)throws Exception
	{
			managerC.readFromFile(quizes);
			System.out.print("which one you want to edit:");
			String quesNo=scan.next();
			System.out.println("To edit question  press 1");
			while(scan.nextInt()==1)
			{
				System.out.print("Changed question:");
				String q=br.readLine();
				System.out.print("Changed options:");
				String o1=scan.next();
				String o2=scan.next();
				String o3=scan.next();
				String o4=scan.next();
				System.out.print("Changed answer:");
				String a=scan.next();
				managerC.updateQuiz(quizes,quesNo,q,o1,o2,o3,o4,a);
			}
			managerC.storeInFile(quizes);
			quizes.clear();
			managerC.readFromFile(quizes);
		
	}		
}
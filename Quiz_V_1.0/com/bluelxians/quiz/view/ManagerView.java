package com.bluelxians.quiz.view;
import com.bluelxians.quiz.controller.ManagerController;
import com.bluelxians.quiz.model.Quiz;
import java.util.ArrayList;
import java.io.*;
/**
*@author Pavana N P
**/
import java.util.Scanner;
public class ManagerView
{
	Scanner scan=new Scanner(System.in);
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r); 
	ManagerController managerC;
	public void managerOperations(ArrayList <Quiz> quizes)throws Exception
	{
		managerC=new ManagerController();
		do
		{
		System.out.println("Operations\n1.Add\n2.Delete\n3.Update");
		switch(scan.nextInt())
		{
			case 1:
			do
			{
					System.out.println("Quiz");
					Quiz quiz=new Quiz();
					add(quiz);
					managerC.addQuiz(quizes,quiz);
					System.out.println("To add questions again press 1");
			}while(scan.nextInt()==1);
			
					managerC.storeInFile(quizes);
					quizes.clear();
					managerC.readFromFile(quizes);
					//System.out.println(quizes.get(0).getType());
					/*for(int i=0;i<quizes.size();i++)
					{
						System.out.println(quizes.get(i).getSession()+","+quizes.get(i).getQuestion()+","+quizes.get(i).getOptionA()+","+quizes.get(i).getOptionB()+","+quizes.get(i).getOptionC()+","+quizes.get(i).getOptionD()+","+quizes.get(i).getAnswer());
					}*/
			break;
			case 2:
			do
			{
					System.out.print("Which sessions question you want to delete:");
					String sess=scan.next();
					System.out.print("Which question you want to delete:");
					String quesNo=scan.next();
					managerC.deleteQuiz(sess,quesNo,quizes);
					System.out.println("To delete questions again press 1");
			}while(scan.nextInt()==1);
					managerC.storeInFile(quizes);
					//quizes.clear();
					managerC.readFromFile(quizes);
			break;
			case 3:
					System.out.print("which one you want to edit:");
					String edit=scan.next();
					
			default:System.out.println("Wrong choice");
			break;
		}
		
		System.out.println("Again do any operation press 1");
		}while(scan.nextInt()==1);
	}
	public void add(Quiz quiz)throws Exception
	{
		System.out.print("Session:");
		quiz.setSession(scan.next());
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
	}
			
}
package com.bluelxians.quiz.controller;
import java.util.*;
import java.io.*;
import com.bluelxians.quiz.model.*;
import com.bluelxians.quiz.controller.ManagerController;
/**
*@author Sarath Kumar S
**/
public class QuizProgramController
{
	ArrayList <Quiz> quizes = new ArrayList <Quiz> ();
	Scanner scan=new Scanner(System.in);
	ManagerController managerC=new ManagerController();
	
	public void sessionView()throws Exception
	{	
		String choice;
		this.managerC.readFromFile(quizes);

		for(int i=0;i<quizes.size();i++)
					{
						
							System.out.println("i+1. "+quizes.get(i).getQuestion()+"\n"+"a)."+quizes.get(i).getOptionA()+"\n"+"b)."+quizes.get(i).getOptionB()+"\n"+"c)."+quizes.get(i).getOptionC()+"\n"+"d)."+quizes.get(i).getOptionD());
							System.out.print("Enter your option:");
							choice=scan.next();
						

					}
		
	}

}
		

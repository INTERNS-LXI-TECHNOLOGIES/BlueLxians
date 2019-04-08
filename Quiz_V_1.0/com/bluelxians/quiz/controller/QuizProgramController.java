package com.bluelxians.quiz.view;
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
	Scanner scan=new Scanner();
	ManagerController managerC=new ManagerController();
	
	public void sessionView(String session)
	{	
		String choice;
		this.managerC.readFromFile(quizes,session);

		for(int i=0;i<quizes.size();i++)
					{
						
							System.out.println("i+1. "+quizes.get(i).getQuestion()+"\n"+"a)."+quizes.get(i).getOptionA()+"\n"+"b)."+quizes.get(i).getOptionB()+"\n"+"c)."+quizes.get(i).getOptionC()+"\n"+"d)."+quizes.get(i).getOptionD());
							System.out.print("Enter your option:");
							choice=scan.next();
						

					}
		
	}

}
		

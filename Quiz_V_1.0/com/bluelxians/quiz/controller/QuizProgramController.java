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
	
	public int checking(String choice)throws Exception
	{
		int score=0;
		managerC.readFromJavaFile(quizes);
		managerC.readFromCFile(quizes);
		managerC.readFromCppFile(quizes);
		for(int i=0;i<quizes.size();i++)
		{
			if(choice.equals(quizes.get(i).getAnswer()))
				{
					score=score+1;	
				}
		}return score;
	}

}
		

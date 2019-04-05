package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.ManagerView;
/**
*@author Pavana N P
**/
public class ManagerController
{
	ManagerView managerV;
	QuizProgramController quizProgramC;
	public void quiz()
	{
	quizProgramC=new QuizProgramController();
	quizProgramC.quizView();
	}
	public void managerOptions()
	{
		managerV=new ManagerView();
		managerV.managerOperations(); 
		
	}
}
package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.ManagerView;
/**
*@author Pavana N P
**/
public class ManagerController
{
	ManagerView managerV;
	public void addQuiz(ArrayList <Quiz> quizes,Quiz quiz)
	{
		quizes.add(quiz);
	}
	public void deleteQuiz()
	{
	}
	public void updateQuiz()
	{
	}
	public void managerOptions()
	{
		managerV=new ManagerView();
		managerV.managerOperations(); 
		
	}
}
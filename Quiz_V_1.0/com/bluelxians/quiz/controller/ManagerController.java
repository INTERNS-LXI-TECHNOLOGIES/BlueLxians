package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.ManagerView;
import com.bluelxians.quiz.model.Quiz;
import java.util.ArrayList;
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
	public void managerOptions(ArrayList <Quiz> quizes)
	{
		managerV=new ManagerView();
		managerV.managerOperations(quizes); 
		
	}
}
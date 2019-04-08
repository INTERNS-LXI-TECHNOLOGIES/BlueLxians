package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.UserView;
import com.bluelxians.quiz.controller.QuizProgramController;
import java.util.*;
/*
@Sarath Kumar S
*/
public class UserController
{
	Scanner scan= new Scanner(System.in);
	QuizProgramController quizProgramC=new QuizProgramController();
	public void quizChoice()throws Exception
	{
		UserView userV=new UserView();
		userV.logedUser();
	}

}
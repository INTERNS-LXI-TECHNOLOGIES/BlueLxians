package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.ManagerView;
import com.bluelxians.quiz.model.Quiz;
import java.util.ArrayList;
import java.io.*;
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
	public void deleteQuiz(String sess,String quesNo,ArrayList <Quiz> quizes)
	{
		for(int i=0;i<quizes.size();i++)
		{
			if(sess.equals(quizes.get(i).getSession()))
			{
				if(quesNo.equals(i+1))
				{
				quizes.remove(i);
				}
			}
		}
		
	}
	public void updateQuiz()
	{
	}
	public void storeInFile(ArrayList <Quiz> quizes)throws Exception
	{
		File file=new File("quiz.csv");
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=0;i<quizes.size();i++)
					{
						bw.write(quizes.get(i).getSession()+","+quizes.get(i).getQuestion()+","+quizes.get(i).getOptionA()+","+quizes.get(i).getOptionB()+","+quizes.get(i).getOptionC()+","+quizes.get(i).getOptionD()+","+quizes.get(i).getAnswer()+"\n");
					}
					bw.close();
	}
	public void readFromFile(ArrayList <Quiz> quizes,String session)throws Exception
	{


		File file=new File("quiz.csv");
		FileWriter fw=new FileWriter(file,true);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
				int k=0;	
				String data;	
				while((data=br.readLine())!=null)
				{
				Quiz quiz=new Quiz();
				String item[]=data.split(",");
				quiz.setSession(item[k]);
				quiz.setQuestion(item[k+1]);
				quiz.setOptionA(item[k+2]);
				quiz.setOptionB(item[k+3]);
				quiz.setOptionC(item[k+4]);
				quiz.setOptionD(item[k+5]);
				quiz.setAnswer(item[k+6]);
				quizes.add(quiz);
				}
				br.close();
				for(int i=0;i<quizes.size();i++)
					{
						System.out.println(quizes.get(i).getSession()+","+quizes.get(i).getQuestion()+","+quizes.get(i).getOptionA()+","+quizes.get(i).getOptionB()+","+quizes.get(i).getOptionC()+","+quizes.get(i).getOptionD()+","+quizes.get(i).getAnswer());
					}
	}
		
	public void managerOptions(ArrayList <Quiz> quizes)throws Exception
	{
		managerV=new ManagerView();
		managerV.managerOperations(quizes); 
		
	}
}
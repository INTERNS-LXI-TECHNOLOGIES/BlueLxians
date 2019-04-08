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
	public void deleteQuiz(String quesNo,ArrayList <Quiz> quizes)
	{
		for(int i=0;i<quizes.size();i++)
		{
			int j=i+1;
			if(Integer.parseInt(quesNo)==j)
			{
				quizes.remove(i);
			}
		}
		
	}
	public void updateQuizQuestion(ArrayList <Quiz> quizes,String quesNo,String q)throws Exception
	{
		for(int i=0;i<quizes.size();i++)
		{
			int j=i+1;
			if(Integer.parseInt(quesNo)==j)
			{
				quizes.get(i).setQuestion(q);
			}
		}
	}
	public void updateQuizAnswer(ArrayList <Quiz> quizes,String quesNo,String a)throws Exception
	{
		for(int i=0;i<quizes.size();i++)
		{
			int j=i+1;
			if(Integer.parseInt(quesNo)==j)
			{
				quizes.get(i).setAnswer(a);
			}
		}
	}
	public void storeInFile(ArrayList <Quiz> quizes)throws Exception
	{
		File file=new File("javaquiz.csv");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=0;i<quizes.size();i++)
					{
						bw.write(quizes.get(i).getQuestion()+","+quizes.get(i).getOptionA()+","+quizes.get(i).getOptionB()+","+quizes.get(i).getOptionC()+","+quizes.get(i).getOptionD()+","+quizes.get(i).getAnswer()+"\n");
					}
					bw.close();
	}
	public void readFromFile(ArrayList <Quiz> quizes,String session)throws Exception
	{

		File file=new File("javaquiz.csv");
		FileWriter fw=new FileWriter(file,true);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
				int k=0;	
				String data;	
				while((data=br.readLine())!=null)
				{
				Quiz quiz=new Quiz();
				String item[]=data.split(",");
				quiz.setQuestion(item[k]);
				quiz.setOptionA(item[k+1]);
				quiz.setOptionB(item[k+2]);
				quiz.setOptionC(item[k+3]);
				quiz.setOptionD(item[k+4]);
				quiz.setAnswer(item[k+5]);
				quizes.add(quiz);
				}
				br.close();
				for(int i=0;i<quizes.size();i++)
					{
						System.out.println((i+1)+"."+quizes.get(i).getQuestion()+"?\na."+quizes.get(i).getOptionA()+"\nb."+quizes.get(i).getOptionB()+"\nc."+quizes.get(i).getOptionC()+"\nd."+quizes.get(i).getOptionD()+"\nAns:"+quizes.get(i).getAnswer());
					}
	}
		
	public void managerOptions(ArrayList <Quiz> quizes,Quiz quiz)throws Exception
	{
		managerV=new ManagerView();
		managerV.managerOperations(quizes,quiz); 
		
	}
}
package com.bluelxians.quiz.view;
import java.util.*;
import java.io.*;
import com.bluelxians.quiz.model.*;
/*
@Sarath Kumar S
*/
/*public class QuizSessionView
{
	public void sessionView(String session)
	{	
		ArrayList <Quiz> quizes = new ArrayList <Quiz> ();
		Scanner scan=new Scanner();
		String answer;
		System.out.print("Questions");
		File file=new File("quiz.csv");
		FileReader fw=new FileReader(file);
		BufferedReader br=new BufferedReader(fw);
		String data;
		int k=0;	
				while((data=br.readLine())!=null)
				{
				Quiz quiz=new Quiz();
				String item[]=data.split(",");
				if (item[0].equals(session)) 
				{
					quiz.setQuestion(item[k+1]);
					quiz.setOptionA(item[k+2]);
					quiz.setOptionB(item[k+3]);
					quiz.setOptionC(item[k+4]);
					quiz.setOptionD(item[k+5]);
					quiz.setAnswer(item[k+6]);
					quizes.add(quiz);
				}
				}
				for(int i=0;i<quizes.size();i++)
					{
						System.out.println("i+1. "+quizes.get(i).getQuestion()+"\n"+"a)."+quizes.get(i).getOptionA()+"\n"+"b)."+quizes.get(i).getOptionB()+"\n"+"c)."+quizes.get(i).getOptionC()+"\n"+"d)."+quizes.get(i).getOptionD());
						System.out.print("Enter your answer:");
						answer=scan.next();
					}

		}
}*/
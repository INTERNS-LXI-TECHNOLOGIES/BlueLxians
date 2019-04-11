package com.bluelxians.quiz.controller;
import com.bluelxians.quiz.view.ManagerView;
import com.bluelxians.quiz.model.Quiz;
import java.util.ArrayList;
import java.io.*;
/**
*<h1>Controller class of manager </h1>
*This class is contain the logic part
*@author Pavana N P
*@version 1.0
*/
public class ManagerController
{
	ManagerView managerV=new ManagerView();
	/*public void createSession(String sessionName)
	{
		
	}*/
	/**
	*This method used to add quiz to the arraylist quizes
	*@param quizes used to store multiple quizes 
	*@param quiz is used to store single quiz
	*@exception Io Exception 
	*/
	public void addQuiz(ArrayList <Quiz> quizes,Quiz quiz)
	{
		quizes.add(quiz);
	}
	/**
	*This method used to delete quiz to the arraylist quizes
	*@param quesNo is used for deleting quiz
	*@param quizes contain multiple quizes 
	*/
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
	/**
	*This method used to update quiz from the arraylist quizes
	*@param quizes contain multiple quizes 
	*@param quesNo is used for deleting quiz
	*@param q is contain the updated question
	*@param o1 is contain the updated option a
	*@param o2 is contain the updated option b
	*@param o3 is contain the updated option c
	*@param o4 is contain the updated option d
	*@param a is contain the updated answer
	*@exception IO Exception
	*/
	public void updateQuiz(ArrayList <Quiz> quizes,String quesNo,String q,String o1,String o2,String o3,String o4,String a)throws Exception
	{
		for(int i=0;i<quizes.size();i++)
		{
			int j=i+1;
			if(Integer.parseInt(quesNo)==j)
			{
				quizes.get(i).setQuestion(q);
				quizes.get(i).setAnswer(a);
				quizes.get(i).setOptionA(o1);
				quizes.get(i).setOptionB(o2);
				quizes.get(i).setOptionC(o3);
				quizes.get(i).setOptionD(o4);
			}
		}
	}
	/**
	*This method is used to store java quizes to javaquiz file
	*@param quizes contain set of quizes
	*@exception IO Exception
	*/
	public void storeInJavaFile(ArrayList <Quiz> quizes)throws Exception
	{
		File file=new File("javaquiz.csv");
		storeInFile(quizes,file);
	}
	/**
	*This method is used to read java quizes from javaquiz file
	*@param quizes contain set of quizes
	*@exception IO Exception
	*/
	public void readFromJavaFile(ArrayList <Quiz> quizes)throws Exception
	{
			File file=new File("javaquiz.csv");
			readFromFile(quizes,file);
	}
	/**
	*This method is used to store c quizes to cquiz file
	*@param quizes contain set of quizes
	*@exception IO Exception
	*/
	public void storeInCFile(ArrayList <Quiz> quizes)throws Exception
	{
		File file=new File("cquiz.csv");
		storeInFile(quizes,file);
	}
	/**
	*This method is used to read c quizes from cquiz file
	*@param quizes contain set of quizes
	*@exception IO Exception
	*/
	public void readFromCFile(ArrayList <Quiz> quizes)throws Exception
	{
			File file=new File("cquiz.csv");
			readFromFile(quizes,file);
	}
	/**
	*This method is used to store cpp quizes to cppquiz file
	*@param quizes contain set of quizes
	*@exception IO Exception
	*/
	public void storeInCppFile(ArrayList <Quiz> quizes)throws Exception
	{
		File file=new File("cppquiz.csv");
		storeInFile(quizes,file);
	}
	/**
	*This method is used to read cpp quizes from cppquiz file
	*@param quizes contain set of quizes
	*@exception IO Exception
	*/
	public void readFromCppFile(ArrayList <Quiz> quizes)throws Exception
	{
			File file=new File("cppquiz.csv");
			readFromFile(quizes,file);
	}
	/**
	*This method is used to write  quizes to a file
	*@param quizes contain set of quizes
	*@param file contain any file javaquiz file or cquiz file or cppquiz file
	*@exception IO Exception
	*/
	public void storeInFile(ArrayList <Quiz> quizes,File file)throws Exception
	{
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=0;i<quizes.size();i++)
					{
						bw.write(quizes.get(i).getQuestion()+","+quizes.get(i).getOptionA()+","+quizes.get(i).getOptionB()+","+quizes.get(i).getOptionC()+","+quizes.get(i).getOptionD()+","+quizes.get(i).getAnswer()+"\n");
					}
					bw.close();
	}
	/**
	*This method is used to read quizes from a file
	*@param quizes contain set of quizes
	*@param file contain any file javaquiz file or cquiz file or cppquiz file
	*@exception IO Exception
	*/
	public void readFromFile(ArrayList <Quiz> quizes,File file)throws Exception
	{
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
	}
	/**
	*This method is used to pass manager operations to administration controller class
	*@param quizes contain set of quizes
	*@param quiz contain single quiz
	*@exception IO Exception
	*/	
	public void managerOptions(ArrayList <Quiz> quizes,Quiz quiz)throws Exception
	{
		managerV.managerOperations(quizes,quiz); 
	}
}
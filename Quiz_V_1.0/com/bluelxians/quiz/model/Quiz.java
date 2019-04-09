package com.bluelxians.quiz.model;
/*
* AUTHOR greeshma
*/ 
public class Quiz
{
    private String question;
    private String optionA;
    private String optionB;	
	private String optionC;	
	private String optionD;	
    private String answer;
	public void setQuestion(String question)
    {
		this.question=question;
	}
    public String getQuestion()
	{
		return question;
	}	
	public void setOptionA(String optionA)
    {
		this.optionA=optionA;
	}
    public String getOptionA()
	{
		return optionA;
	}	
	public void setOptionB(String optionB)
    {
		this.optionB=optionB;
	}
    public String getOptionB()
	{
		return optionB;
	}	
	public void setOptionC(String optionC)
    {
		this.optionC=optionC;
	}
    public String getOptionC()
	{
		return optionC;
	}	
	public void setOptionD(String optionD)
    {
		this.optionD=optionD;
	}
    public String getOptionD()
	{
		return optionD;
	}
    public void setAnswer(String answer)
    {
		this.answer=answer;
	}
    public String getAnswer()
	{
		return answer;
	}		
}
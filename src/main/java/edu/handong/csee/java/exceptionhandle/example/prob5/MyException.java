package edu.handong.csee.java.exceptionhandle.example.prob5; // package of prob5

public class MyException extends Exception // class MyException 
{
	private String message = null; // private value message

	public MyException() // method MyException 
	{
		super(); // parent
	}

	public MyException(String message) // method MyException 
	{
		super(message); // parent message
		this.message = message; // instantiate message
	}

	public MyException(Throwable cause) // method MyException 
	{
		super(cause); // parent cause
	}

	public String toString() // method toString 
	{ 
		return message; // returning value of message
	}
}

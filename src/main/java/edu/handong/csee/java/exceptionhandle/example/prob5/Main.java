package edu.handong.csee.java.exceptionhandle.example.prob5; // package of prob5
import java.util.Scanner; // import scanner from java library

public class Main // class Main
{
	public static void main(String[] a) // main method
	{
		try // check out if it is in valid condition
		{
			Scanner keyboard = new Scanner(System.in); // using input keyboard
			String str = keyboard.nextLine(); // string from keyboard
			Main.myTest(str); // put str to myTest
		} 
		catch(MyException mae) // exceptional case
		{
			System.out.println("Inside catch block: " + mae);// print out text
		}
	}

	static void myTest(String str) throws MyException // method MyTest
	{
		if(str.equals("null")) // condition of equals
		{ 
			throw new MyException("String val is null"); // print out text
		}
		else // condition of not equals
			System.out.println("String val is:" + str); // print out text and result
	}
}


package edu.handong.csee.java.exceptionhandle.example.prob2; // package of prob2
import java.util.*; // import util.* from java library

public class Inexception // class In_exception
{
	private int x = 0, y = 0; // private value x,y

	{}
	public void error_det() // method error_det 
	{

		try // check out which is exceptional
		{
			Scanner keyboard = new Scanner(System.in); // using input from keyboard
			System.out.print("x: "); // print out value of x
			x = keyboard.nextInt(); // input x from keyboard
			System.out.print("y: "); // print out value of y
			y = keyboard.nextInt(); // input y from keyboard
			System.out.println(this.x/this.y); // print out each x,y
		}
		catch(ArithmeticException e) // catch out exceptional case
		{
			System.out.println("java.lang.ArithmeticException: " + e.getMessage()); // print out text
		}
		catch(InputMismatchException e) // catch out exceptional case
		{
			System.out.println("java.util.InputMismatchException"); // print out text
		}
		catch(Exception e)// catch out exceptional case
		{
			System.out.println("Some other exception has occurred: " + e.getMessage());// print out text
		}
	}

}

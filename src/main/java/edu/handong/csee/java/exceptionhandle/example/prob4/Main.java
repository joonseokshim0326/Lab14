package edu.handong.csee.java.exceptionhandle.example.prob4; // package of prob4
import java.util.Scanner; // import Scanner from java library

public class Main // class Main
{
	public static void main(String[] args) // main method
	{
		Scanner keyboard = new Scanner(System.in); // using input from keyboard
		int num = 0; // variable num
		Boundary arr = new Boundary(); // instantiatae arr
		boolean repeat = true; // put true value to boolean variable repeat 
		while(repeat) // iterative in given conditon
		{
			try // check out valid or not
			{
				System.out.print("Enter an integer: "); //print out text
				num = keyboard.nextInt(); // input from keyboard
				arr.receive(num); // array using input
			}
			catch(ArrayIndexOutOfBoundsException e) // invalid condition
			{
				System.out.println("Invalid array index access!"); // print out text
				repeat = false; // put false to repeat
			}
		}
	}
}

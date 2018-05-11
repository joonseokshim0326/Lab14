package edu.handong.csee.java.exceptionhandle.example.prob6; // package of prob6
import java.util.Scanner; // import scanner from java library

public class Main // class Main
{
	public static void main(String[] args) // main method
	{
		String name, race; //  variable name, race
		int age = 0; //  variable age
		Scanner keyboard = new Scanner(System.in); // using input from keyboard
		CustomID obj = new CustomID(); // instantiate obj
		boolean repeat = true; // put value of true to repeat

		while(repeat) // implementation condition of loop
		{
			try // check out name is valid
			{
				if(obj.getState() == 0)  // getState is 0
				{
					System.out.print("Enter your name: "); // print out text
					name = keyboard.nextLine(); // input from keyboard
					obj.set_name(name); // setting name to customID

				}
				else if(obj.getState() == 1)  // getState = 1
				{
					System.out.print("Enter your age: "); // print out text
					age = keyboard.nextInt(); // input from keyboard
					keyboard.nextLine(); // input from keyboard
					obj.set_age(age); // setting age to custom id
				}
				else if(obj.getState() == 2) // getState =2
				{
					System.out.print("Enter your race: "); // print out text
					race = keyboard.nextLine(); // input from keyboard
					obj.set_race(race); // setting race to customID
				}
			}
			catch(Exception e) // invalid condition
			{
				System.out.println(e.getMessage()); // print out text 
				continue; //  continue to implement
			}
		}
	}
}

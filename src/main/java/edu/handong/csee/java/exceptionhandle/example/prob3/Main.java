package edu.handong.csee.java.exceptionhandle.example.prob3; // package of prob3
import java.util.Scanner; // import scanner from java library

public class Main // class Main
{
	public static final Powercalc my_calculator = new Powercalc(); // instantiate my_caluculator
	public static final Scanner in = new Scanner(System.in); // instantiate in

	public static void main(String[] args) // main method
	{
		while (in.hasNextInt()) // in condition of input n,p
		{
			int n = in.nextInt(); // value n
			int p = in.nextInt(); // value p

			try // check out using input n,p in valid condition
			{
				System.out.println(my_calculator.power(n, p)); // print out text and result
			} 
			catch (Exception e) // check out exceptional case
			{
				System.out.println(e); // print out result
			}
		}
	}

}

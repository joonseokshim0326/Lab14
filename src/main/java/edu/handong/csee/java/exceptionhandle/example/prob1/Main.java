package edu.handong.csee.java.exceptionhandle.example.prob1; // package of prob1
import java.util.Scanner; // import scanner from java library
import java.util.Random; // import random from java library

public class Main // class Main
{
	public static void main(String[] args) // main method
	{
		Scanner keyboard = new Scanner(System.in); // using input from keyboard
		Random rand = new Random(); // using random input 
		int limit = 0, speed = 0; // initial value of limit and speed

		System.out.print("Set the speed limit, officer: "); // print out text
		limit = keyboard.nextInt(); // get limit from keyboard input
		speed = rand.nextInt(101); // get speed from random input

		SpeedLimitter lim = new SpeedLimitter(limit, speed); // instantiate lim

		lim.warnSpeedLimit(); // warning the speed limit

		keyboard.close(); // termination of keyboard input

	}



}

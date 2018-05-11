package edu.handong.csee.java.exceptionhandle.example.prob6; // package of prob6

public class CustomID extends Exception // class CustomID
{
	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"}; // private races
	private String name = ""; // private name
	private int age = 0; // private age
	private String race = ""; // private race
	private int state = 0; // private state

	public void set_name(String str) throws Exception // method set_Name
	{
		if(str.length() < 5) // if length of name <5
		{
			state = 0; // put 0 to state
			throw new Exception("Your name is short! Try again!"); // print out text
		}

		else // length of name >= 5 
		{
			this.name = str; // put str to name
			System.out.println("Name is valid"); // print out text
			System.out.println("Name: " + this.name); // print out text and name
			state++; // iteratively increase by 1
		}
	}



	public void set_age(int num) throws Exception // method set_age
	{
		if(num < 18) // age <18 
		{
			state = 1; // initial value of state
			throw new Exception("You are too young! Try again!"); // print out text
		}
		else // age >= 18 
		{
			this.age = num; // put num to age
			System.out.println("Age is valid"); // print out text
			System.out.println("Age: " + this.age); // print out text and age
			state++; // iteratively increase by 1
		}
	}

	public void set_race(String race) throws Exception // method set_race
	{
		for(int i = 0; i < races.length; i++) // implementation of loop
		{
			if(races[i].equals(race)) // races is equal
			{
				this.race = races[i]; // races[i] to race
				System.out.println("Race is valid"); // print out text
				System.out.println("Race: " + races[i]); // print out text and races
				state = 0; // put 0 to state
				return; // rerurning result
			}
		}
		state = 2; // value of state is 2
		throw new Exception("Human! Try again."); // print out text
	}
	public int getState() // method getState
	{
		return state; // returing state
	}
}
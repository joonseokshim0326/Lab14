package edu.handong.csee.java.exceptionhandle.example.prob1; // package of prob1

public class SpeedLimitter //  class SpeedLimtter 
{
	private int speed = 0; // private value speed
	private int limit = 0; // private value limit
	public SpeedLimitter(int limit, int speed) // constructor SpeedLimitter
	{
		this.limit = limit; // instantiate limit
		this.speed = speed; // instantiate speed
	}

	public void warnSpeedLimit() // method wanrSpeedLimit
	{
		try // check out speed and compare with limit
		{
			if(this.speed > this.limit) //  speed above limit
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!"); //print out text
			}
			System.out.println("You are a law abiding citizen!"); // print out law abiding message
		}
		catch(Exception e) // if it is above limit
		{
			System.out.println(e.getMessage()); // print out text
			System.out.println("You are being fined. "); // print out text
		}
		System.out.println("Your current speed: " + this.speed); // print out text
	}
}




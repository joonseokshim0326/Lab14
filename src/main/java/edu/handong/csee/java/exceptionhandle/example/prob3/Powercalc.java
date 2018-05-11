package edu.handong.csee.java.exceptionhandle.example.prob3; // package of prob3

public class Powercalc // class Powercalc
{
	public long power(int n, int p) throws Exception // method power
	{
		long result = 0; // value result , initial =0

		result = (long)Math.pow(n, p); // getting output result using input n,p
		if(n < 0 || p < 0) // if both n,p negative
		{
			throw new Exception("n or p should not be negative."); // print out text
		}
		if(n == 0 && p == 0) // if both n,p is zero
		{
			throw new Exception("n and p should not be zero."); // print out text
		}
		return result; // returning value of result

	}
}

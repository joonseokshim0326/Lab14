package edu.handong.csee.java.exceptionhandle.example.prob4; // package of prob4

public class Boundary // class Boundary
{
	private static int [] arr = new int[5]; // private array arr
	private static int cnt = 0; // private variable cnt
	public void receive(int num) throws ArrayIndexOutOfBoundsException // receive
	{
		int i = cnt; // put value of cnt to i
		arr[i] = num; // put num to arr
		cnt++; // iteratively increase by 1
		System.out.printf("arr[%d] <- %d\n", i, num); // print out text
	}
}

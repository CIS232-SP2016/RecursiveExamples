package edu.cis232;

public class InfiniteRecursion {

	public static void main(String[] args) {
		recursion();
	}
	
	public static void recursion(){
		//Infinite recursion is bad.
		//This will result in a StackOverflowError
		System.out.println("Infinite Recursion!");
		recursion();
	}

}

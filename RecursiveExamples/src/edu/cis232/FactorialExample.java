package edu.cis232;

public class FactorialExample {

	public static void main(String[] args) {
		System.out.println(factorial(10));
	}
	
	public static int factorial(int n){
		//Base case
		//Ends the recursion. It does not call the recursive method.
		if(n <= 1){
			return 1;
		}
		
		//Recursive case
		//Continues the recursion with a method call that gets you closer
		//to the base case.
		return n * factorial(n-1);
	}

}

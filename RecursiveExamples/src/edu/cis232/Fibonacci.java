package edu.cis232;

import java.math.BigInteger;

public class Fibonacci {

	public static void main(String[] args) {
		
		fibProgressor(100);
	}
	
	public static void fibProgressor(int n){
		if(n <= 0){
			return;
		}
		
		fibProgressor(n - 1);
		System.out.printf("%d element is %d%n", n, fib(n));
	}
	
	public static BigInteger fib(int n){
		//Base Case #1
		if(n <= 1){
			return BigInteger.ZERO;
		}
		
		//Base Case #2
		if(n == 2){
			return BigInteger.ONE;
		}
		
		//Recursive case
		return fib(n-1).add(fib(n-2));
	}

}

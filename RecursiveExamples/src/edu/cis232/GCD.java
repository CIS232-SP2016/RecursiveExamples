package edu.cis232;

public class GCD {
	public static void main(String[] args){
		System.out.println(gcd(200,8000));
	}
	
	public static int gcd(int x, int y){
		//Base Case
		//If y divides x evenly, then gcd(x,y) = y
		if(x % y == 0){
			return y;
		}
		
		//Recursive Case
		//Otherwise gcd(x,y) = gcd(y, remainder of x/y)
		return gcd(y, x % y);
	}
}

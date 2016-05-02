package edu.cis232;

public class RecursionExample1 {

	public static void main(String[] args) {
		recursive(3);
	}

	public static void recursive(int n){
		if( n >= 0 ){
			System.out.println(n);
			recursive(n - 1);
		}
	}
}

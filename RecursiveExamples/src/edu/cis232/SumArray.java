package edu.cis232;

public class SumArray {

	public static void main(String[] args) {
		int[] array = {1,2,3};
		System.out.println(sum(array, 0, array.length - 1));
	}

	public static int sum(int[] arr, int start, int end){
		//Base case
		//The range (start to end) is 0 or fewer elements
		if( start > end ){
			return 0;
		}
		
		//Recursive case
		//Add the current value to the sum of the rest of the array
		return arr[start] + sum(arr, start + 1, end);
	}
}

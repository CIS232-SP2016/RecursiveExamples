package edu.cis232;

import java.util.Scanner;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,8,12,200};
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What value would you like to find?");
		int searchVal = keyboard.nextInt();
		int foundIndex = binarySearch(arr, searchVal);
		if(foundIndex < 0){
			System.out.println("Value not found in array");
		} else {
			System.out.printf("Value found at index %d%n", foundIndex);
		}

	}
	
	public static int binarySearch(int[] values, int search){
		return binarySearchRecursive(values, 0, values.length - 1, search);
	}
	
	/**
	 * Return the index of the found element or -1 if not found.
	 * @param values
	 * @param start
	 * @param end
	 * @param search
	 * @return
	 */
	public static int binarySearchRecursive(int[] values, int start, int end, int search){
		System.out.printf("Searching %d to %d indexes%n", start, end);
		//Base cases
		//First base case, we did not find it
		if(start > end){
			return -1;
		}
		
		int middle = (start + end) / 2;
		//Second base case, we found it
		if(values[middle] == search){
			return middle;
		}
		
		if(search < values[middle]){
			return binarySearchRecursive(values, start, middle - 1, search);
		} else {
			return binarySearchRecursive(values, middle + 1, end, search);
		}
	}

}

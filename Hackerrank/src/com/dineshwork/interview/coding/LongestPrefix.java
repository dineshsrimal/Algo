package com.dineshwork.interview.coding;

public class LongestPrefix {

	// Driver code
	static public void main(String[] args) {
		int[] arr = { 7, 42, 5, 6, 42, 8, 7, 5, 3, 6, 7 };
		int[] arr2 = { 6, 42, 11, 7, 1, 42 };
		int X = 7, Y = 42;
		int n = arr.length;
		int n2 = arr2.length;

		System.out.println("Ending index of prefix is " + findIndex(arr, X, Y, n));
		System.out.println("Ending index of prefix is " + findIndex(arr2, X, Y, n2));

		System.out.println("Ending index of prefix is " + solution(X, Y, arr));
		System.out.println("Ending index of prefix is " + solution(X, Y, arr2));
	}

	// Function to find the max index
	// of largest prefix with same
	// number if X and Y
	static int findIndex(int[] arr, int X, int Y, int n) {

		// counters for X and Y
		int nx = 0, ny = 0;

		int result = -1;
		for (int i = 0; i < n; i++) {
			// If value is equal to X
			// increment counter of X
			if (arr[i] == X)
				nx++;

			// If value is equal to Y
			// increment counter of Y
			if (arr[i] == Y)
				ny++;

			// If counters are equal(but not
			// zero) save the result as i
			if ((nx != 0) && (nx == ny))
				result = i;
		}

		return result;
	}

	static int solution(int X, int Y, int[] A) {	
		int length = A.length;
		int noOfX = 0;
		int noOfY = 0;		

		int longestPrefix = -1;
		for (int i = 0; i < length; i++) {
			
			if (A[i] == X) {
				noOfX++;
			}				

			if (A[i] == Y) {
				noOfY++;
			}				

			if ((noOfX != 0) && (noOfX == noOfY)) {
				longestPrefix = i;
			}				
		}

		return longestPrefix;
	}

}

package com.dineshwork.interview.coding;

import java.util.Arrays;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 7, 5, 4, 8, 9, 2};
		System.out.println("Missing number is..: " + findMissingNumber(arr));
	}
	
	public static int findMissingNumber(int[] arr) {
		int[] sortedArr = Arrays.stream(arr).sorted().toArray();
		int missingNumber = -1;
		
		for(int i = 0; i < 10; i++) {
			
			if(i + 1 != sortedArr[i]) {
				missingNumber = i + 1;
				break;
			}
		}
		
		return missingNumber;
	}

}

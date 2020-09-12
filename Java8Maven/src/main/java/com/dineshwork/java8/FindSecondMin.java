package com.dineshwork.java8;

import java.util.Arrays;

public class FindSecondMin {
	
	public static void main(String[] args) {
		int[] arr = {3,44,12,6,8,4,5,1,9};
		
		System.out.println("Second Min Easy..." + findSecondMinEasy(arr));
	}	

	
	public static int findSecondMinEasy(int[] arr) {
		Arrays.sort(arr);
		
		return arr[1];
	}

}

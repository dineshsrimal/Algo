package com.dineshwork.java8;

import java.util.Arrays;
import java.util.Collections;

public class FindSeconHigh {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 2, 6, 8, 4, 5, 3, 9 };		
		System.out.println("Second High Easy...." + findSecondHighEasy(arr));
	}


	public static int findSecondHighEasy(int[] arr) {

		Integer[] boxedArray = new Integer[arr.length];

		for (int i = 0; i < arr.length; i++) {
			boxedArray[i] = Integer.valueOf(arr[i]);
		}
		Arrays.sort(boxedArray, Collections.reverseOrder());
		return boxedArray[1];
	}
}

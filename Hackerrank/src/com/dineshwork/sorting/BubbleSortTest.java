package com.dineshwork.sorting;

import java.util.Arrays;

public class BubbleSortTest {
	
	public static void main(String[] args) {
		Integer[] arr = {6,7,3,2,1,4,9};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void bubbleSort(Integer[] arr) {
		boolean isSorted = false;
		int tmp;
		
		while(!isSorted) {
			isSorted = true;
			
			for(int i=0; i < arr.length -1; i++) {
				
				if(arr[i] > arr[i+1]) {
					tmp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1]= tmp;
					isSorted = false;
				}
			}
		}
		
	}
	


}

package com.dineshwork;

import java.util.*;

public class CountUniquePairs2 {
	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 7, 5, 4, 2, 1 , 6, 3};
		System.out.println("Pair Count: " + findUniquePairsEffitient(arr, 5));
	}
	
	
	public static int findUniquePairsEffitient(int[] arr, int sum) {
		
		Map<Integer, Integer> numberFrequency = new HashMap<>();
		int pairCount = -1;
		
		for(int i=0; i < arr.length; i++) {
			
			Integer frequency = numberFrequency.get(arr[i]);
			
			if(frequency == null) {
				frequency = 1;				
			}else {
				frequency++;				
			}		
			
		}
		
		return pairCount;
	}

}

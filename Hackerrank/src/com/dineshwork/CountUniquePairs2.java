package com.dineshwork;


public class CountUniquePairs2 {
	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 7, 5, 4, 2, 1 , 6, 3};
		System.out.println("Pair Count: " + findUniquePairsEfficient(arr, 5));
	}
	
	
	public static int findUniquePairsEfficient(int[] arr, int sum) {
		int[] frequencyArr = new int[sum + 1];
		int pairCount = 0;
		
		for(int i=0; i < arr.length; i++) {
			
			if(arr[i] <= sum) {
				frequencyArr[arr[i]] = frequencyArr[arr[i]] + 1;
			}
			
		}
		
		for(int j=0; j < frequencyArr.length; j++) {
			
			int remainder = sum - j;
			
			pairCount = pairCount + (frequencyArr[j] * frequencyArr[remainder]);
		}
		
		return pairCount / 2;
	}

}

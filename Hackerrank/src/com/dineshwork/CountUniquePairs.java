package com.dineshwork;

import java.util.HashMap;
import java.util.Map;

public class CountUniquePairs {
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 1, 7, 5, 4, 2, 1 , 6, 3};
		System.out.println("Pair Count: " + findUniquePairs(arr, arr.length));
		System.out.println("Git commit tesjjhsjkdhkjshdkjshdkjht..");
		
	}
	
	public static int findUniquePairs(int[] arr, int n) {
		int pairCount = 0;
		int pairSum = 5;
		Map<String, Integer> pairIdxMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				String idxPairKey = String.valueOf(i).concat(String.valueOf(j));
				// String idxPair

				if ((arr[i] + arr[j] == pairSum) && (pairIdxMap.get(idxPairKey) == null)) {
					pairIdxMap.put(idxPairKey, 1);
					pairCount++;
				}
			}

		}
		
		return pairCount;
	}
}

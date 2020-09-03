package com.dineshwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountUniquePairs {
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 1, 7, 5, 4, 2, 1 , 6, 3};
		System.out.println("Pair Count: " + findUniquePairs(arr, arr.length));
		System.out.println("Pair Count Efficient: " + findUniquePairsOptimum(arr, arr.length));
		
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
	
	public static int findUniquePairsOptimum(int[] arr, int n) {
		int pairCount = 0;
		int pairSum = 5;
		Map<Integer, Integer> numberAvailCount = new HashMap<Integer, Integer>();
		List<Integer> consideredVals = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) { //first populate a map with a value and its indexes of the array
			int num = arr[i];
			Integer numCount = numberAvailCount.get(num);
			
			if(numCount != null) {
				numberAvailCount.put(num, numCount + 1);
			}else {
				numberAvailCount.put(num, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : numberAvailCount.entrySet()) { // then iterate the Map and get the pair count(Mulitiply index counts) such that value sum = 5
			
			if(consideredVals.contains(entry.getKey())) {
				continue;
			}
			
			int remainder = pairSum - entry.getKey();
			Integer remainValCount = numberAvailCount.get(remainder);
			consideredVals.add(entry.getKey());
			
			if(remainValCount != null) {
				pairCount = pairCount + (entry.getValue() * remainValCount);
				consideredVals.add(remainder);
			}
			
		}
		
		return pairCount;
	}
}

package com.dineshwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class CountNumberPairs {

	public static void main(String[] args) {

		int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println(sockMerchant(9,  arr));
		System.out.println(sockMerchantEfficient(9,  arr));
	}

	public static int sockMerchant(int n, int[] ar) {
		List<Integer> sockColorList = new ArrayList<>();
		int pairCount = 0;
		
		for(int i=0; i < n; i++) {
			Integer color = ar[i];
			
			if(sockColorList.contains(color)) {
				pairCount++;
				sockColorList.remove(color);				
			}else {
				sockColorList.add(color);
			}
			
			
		}

		return pairCount;
	}
	
	public static int sockMerchantEfficient(int n, int[] ar) {
		Map<Integer, Integer> sockPairCount = new HashMap<Integer, Integer>();
		int pairCount = 0;
		
		for(int i=0; i < n; i++) {
			Integer color = ar[i];
			
			if(sockPairCount.get(color) != null && sockPairCount.get(color) == 1 ) {
				pairCount++;
				sockPairCount.put(color, 0);
			}else {
				sockPairCount.put(color, 1);
			}
		}
		
		
		return pairCount;
	}
}

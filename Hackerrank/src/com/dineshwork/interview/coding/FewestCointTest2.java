package com.dineshwork.interview.coding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FewestCointTest2 {
	public static void main(String[] args) {
		String str = "dabbcabcd";
		String str1 = "dabbczabcdacdz";
		String [] chars = str.split(""); 
		List<String> strArr =  Stream.of(chars).distinct().collect(Collectors.toList()); 
		System.out.println(strArr);
		
		System.out.println(fewestCoin(str));
		System.out.println(fewestCoinOptimized(str));
		
		System.out.println(fewestCoin(str1));
		System.out.println(fewestCoinOptimized(str1));
	}
	
	public static int fewestCoin(String str) {
		String [] chars = str.split(""); 
		List<String> distinctStrList =  Stream.of(chars).distinct().collect(Collectors.toList());
		Set<String> distinctStrSet;
		
		int minSubtringLength = 100000000;
		int subStringLength;
		
		for(int i=0; i < chars.length; i++) {			
			distinctStrSet = new HashSet<String>(distinctStrList);
			
			for(int j=i; j < chars.length; j++) {
				
				if(distinctStrSet.contains(chars[j])) {
					distinctStrSet.remove(chars[j]);
				}
				
				if(distinctStrSet.isEmpty()) {
					subStringLength = j - i + 1;
					distinctStrSet = new HashSet<String>(distinctStrList);
					
					if(subStringLength < minSubtringLength) {
						minSubtringLength = subStringLength;
					}
				}				
				
			}
		}		
		
		return minSubtringLength;
	}
	
	public static int fewestCoinOptimized(String str) {
		String [] chars = str.split(""); 
		List<String> distinctStrList =  Stream.of(chars).distinct().collect(Collectors.toList());
		Set<String> distinctStrSet;
		
		int minSubtringLength = 100000000;
		int subStringLength;
		
		for(int i=0; i < chars.length; i++) {			
			distinctStrSet = new HashSet<String>(distinctStrList);
						
			for(int j=i; j < chars.length; j++) {
				subStringLength = j - i + 1;
				
				if(subStringLength > minSubtringLength) {
					break;
				}
				
				if(distinctStrSet.contains(chars[j])) {
					distinctStrSet.remove(chars[j]);
				}
				
				if(distinctStrSet.isEmpty()) {					
					distinctStrSet = new HashSet<String>(distinctStrList);
					
					if(subStringLength < minSubtringLength) {
						minSubtringLength = subStringLength;						
					}
				}			
				
			}
		}		
		
		return minSubtringLength;
	}
}

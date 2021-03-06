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
		 int n = str.length(); 
		 int MAX_CHARS = 256;
		  
	        // Count all distinct characters. 
	        int dist_count = 0; 
	  
	        boolean[] visited = new boolean[MAX_CHARS]; 
	        Arrays.fill(visited, false); 
	        for (int i = 0; i < n; i++) { 
	            if (visited[str.charAt(i)] == false) { 
	                visited[str.charAt(i)] = true; 
	                dist_count++; 
	            } 
	        } 	  
	     
	        int start = 0, start_index = -1; 
	        int min_len = Integer.MAX_VALUE; 
	  
	        int count = 0; 
	        int[] curr_count = new int[MAX_CHARS]; 
	        for (int j = 0; j < n; j++) { 
	            // Count occurrence of characters of string 
	            curr_count[str.charAt(j)]++; 
	  
	            if (curr_count[str.charAt(j)] == 1) 
	                count++; 
	  
	            // if all the characters are matched 
	            if (count == dist_count) { 
	                
	                while (curr_count[str.charAt(start)] > 1) { 
	                    if (curr_count[str.charAt(start)] > 1) 
	                        curr_count[str.charAt(start)]--; 
	                    start++; 
	                } 
	  
	                // Update window size 
	                int len_window = j - start + 1; 
	                if (min_len > len_window) { 
	                    min_len = len_window; 
	                    start_index = start; 
	                } 
	            } 
	        } 
	       
	        return str.substring(start_index, start_index + min_len).length(); 
	}
	
	public static int fewestCoinOptimized(String str) {
		String [] chars = str.split(""); 
		List<String> distinctStrList =  Stream.of(chars).distinct().collect(Collectors.toList());
		//Set<String> distinctSet =  Stream.of(chars).distinct().collect(Collectors.toSet());
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

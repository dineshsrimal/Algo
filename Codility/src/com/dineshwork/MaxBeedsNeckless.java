package com.dineshwork;

import java.util.ArrayList;
import java.util.List;

public class MaxBeedsNeckless {
	
	public static void main(String[] args) {
		int[] arr = new int[7];
		arr[0] = 5;
		arr[1] = 4;
		arr[2] = 0;
		arr[3] = 3;
		arr[4] = 1;
		arr[5] = 6;
		arr[6] = 2;
		/*
		 * arr[7] = 10; arr[8] = 11; arr[9] = 12; arr[10] = 8; arr[11] = 9; arr[12] = 7;
		 */
		
		int[] arr1 = new int[14];
		arr1[0] = 5;
		arr1[1] = 4;
		arr1[2] = 0;
		arr1[3] = 3;
		arr1[4] = 1;
		arr1[5] = 6;
		arr1[6] = 2;
		arr1[7] = 10;
		arr1[8] = 11;
		arr1[9] = 12;
		arr1[10] = 8;
		arr1[11] = 9;
		arr1[12] = 13;
		arr1[13] = 7;
		
		int[] arr2 = new int[2];
		arr2[0] = 1;
		arr2[1] = 0;
		
		System.out.println(solution(arr2));
	}
	
	public static int solution(int A[]) {
		
		int total = A.length;
		int maxNoOfBeeds = 0;		
		List<Integer> utilizedIdx = new ArrayList<>();
		int necklessBeedCount = 1;
		int necklessStartIdx = 0;
		int necklessNextIndex = 0;
		utilizedIdx.add(necklessStartIdx);
		
		for(int i=0; i < total; i++ ) {		
	
			if(i !=0 && utilizedIdx.contains(i)) {
				continue;
			}else {
				necklessStartIdx = i;
				necklessNextIndex = A[i];
			}
			
			while(necklessStartIdx != necklessNextIndex) {
				necklessBeedCount++;
				utilizedIdx.add(necklessNextIndex);
				necklessNextIndex = A[necklessNextIndex];	
			}
			
			if(necklessStartIdx == necklessNextIndex) {
				if(maxNoOfBeeds < necklessBeedCount) {
					maxNoOfBeeds =  necklessBeedCount;
				}	
				
				necklessBeedCount = 1;
			}
			
		}
		
		return maxNoOfBeeds;
	}
}

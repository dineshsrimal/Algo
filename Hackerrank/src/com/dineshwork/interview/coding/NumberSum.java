package com.dineshwork.interview.coding;

public class NumberSum {

	public static void main(String[] args) {
		System.out.println(getSequenceSum(5, 9, 6));
	}
	
	static long getSequenceSum(int i, int j, int k) {
	 
		long sum = 0;
		
		for(int p=i; p < j; p++) {
			sum = sum + p;
		}
		
		for(int q=j; q >= k; q--) {
			sum = sum + q;
		}
		
		
		return sum;
	}

}

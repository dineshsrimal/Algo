package com.dineshwork;

public class CountingValleys {

	public static void main(String[] args) {
		System.out.println(countingValleys(16, "UDDDUDUUUDDDUDUU"));
	}
	
	public static int countingValleys(int n, String s) {
		
		int noOfValleys = 0;
		int noOfStepsFromSeaLvl = 0;		
		
		for(int i=0; i < n; i++) {
			char step = s.charAt(i);
			
			if(noOfStepsFromSeaLvl == 0 && step == 'D') {				
				noOfValleys++;
			}
			
			if(step == 'U') {
				noOfStepsFromSeaLvl++;
			} else {
				noOfStepsFromSeaLvl--;
			}			
			
		}
		
		return noOfValleys;
	}
}

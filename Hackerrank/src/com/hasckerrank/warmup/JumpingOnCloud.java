package com.hasckerrank.warmup;

public class JumpingOnCloud {

	public static void main(String[] args) {
		
		int[] cloudArr = {0, 0, 1, 0, 0, 1, 0};
		int[] cloudArr2 = {0, 0, 0, 0, 1, 0};
		
		System.out.println(jumpingOnClouds(cloudArr));
		System.out.println(jumpingOnClouds(cloudArr2));
		
	}
	
	static int jumpingOnClouds(int[] c) {
		
		int currentPosition = 0;
		int prevPosition = 0;
		int jumpCount = 0;
		
		while(currentPosition < c.length - 1) {
			
			prevPosition = currentPosition;
			
			if((currentPosition + 2) < c.length && (c[currentPosition + 2] == 0)) {
				currentPosition = currentPosition + 2;
				jumpCount++;
			}else if(c[currentPosition + 1] == 0) {
				currentPosition = currentPosition + 1;
				jumpCount++;
			}
			
			if(prevPosition == currentPosition) { // Path not available
				jumpCount = -1;
				break;
			}		
			
		}		

		return jumpCount;
    }
}

package com.dineshwork;

public class IntAOccuresInB {
	
	public static void main(String[] args) {
		System.out.println(solution(1953786, 53));
		System.out.println(solution(195378678, 78));
		System.out.println(solution(153786, 57));
	}
	
	public static int solution(int A, int B) {
		
		int index = -1;
		String integerStrA = String.valueOf(A);
		String integerStrB = String.valueOf(B); 
		int intALength = integerStrA.length();
		int intBLength = integerStrB.length();
		
		/*int AA = 1267576539;
		int BB = 653;*/
		
		for(int i=0; i < intALength; i++) {
			
			if(integerStrA.charAt(i) == integerStrB.charAt(0) && (intALength - i) >= intBLength) {
				int k = i + 1;
				index = i;
				
				for(int j=1; j < intBLength; j++) {
					
					if(integerStrA.charAt(k) != integerStrB.charAt(j)) {
						index = -1;
						break;
					}
					
					k++;
				}
				
			}
		}
		
		return index;		
	}

}

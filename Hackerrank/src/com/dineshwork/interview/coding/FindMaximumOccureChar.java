package com.dineshwork.interview.coding;

import java.util.*;
import java.util.Map.Entry;

public class FindMaximumOccureChar {

	public static void main(String[] args) {
		String str1 = "test string";
		String str2 = "abbbaacc";
		System.out.println("The given string is: " + str1);
		System.out.println("Max occurring character in the given str1 is: " + MaxOccuringCharEfficient(str1));
		System.out.println("Max occurring character in the given str2 is: " + MaxOccuringCharEfficient(str2));
		System.out.println("===============================================");
		System.out.println("Max occurring character in the given str1 is: " + MaxOccuringChar(str1));
		System.out.println("Max occurring character in the given str2 is: " + MaxOccuringChar(str2));
	}

	public static char MaxOccuringChar(String str) {

		char[] charArray = str.toCharArray();
		Map<Character, Integer> charFrequency = new HashMap<>();
		Map<Character, Integer> charPosition = new HashMap<>();
		

		for (int i = 0; i < charArray.length; i++) {
			Integer frequency = charFrequency.get(charArray[i]);

			if (frequency == null) {
				frequency = 1;
			} else {
				frequency = frequency + 1;
			}

			charFrequency.put(charArray[i], frequency);
			charPosition.put(charArray[i], i);
		}

		char maxChar = ' ';
		int mxCharIdx = charArray.length + 1;
		int maxFrequency = 0;

		for (Entry<Character, Integer> entry : charFrequency.entrySet()) {

			if(entry.getValue() > maxFrequency) {
				maxFrequency = entry.getValue();
				
				if(charPosition.get(entry.getKey()) < mxCharIdx ) {
					maxChar = entry.getKey();
				}
				
				
			}
		}
		
		return maxChar;
	}

	static char MaxOccuringCharEfficient(String str1) {
		int asciCharFreqArr[] = new int[256];
		int strLength = str1.length();

		for (int i = 0; i < strLength; i++) {
			int asciCharVal = str1.charAt(i);

			int frequency = asciCharFreqArr[asciCharVal];
			asciCharFreqArr[asciCharVal] = frequency + 1;
		}

		int maxFrequency = 0;
		char maxOccuringChar = ' ';

		for (int i = 0; i < strLength; i++) {
			int asciCharVal = str1.charAt(i);

			if (maxFrequency < asciCharFreqArr[asciCharVal]) {
				maxFrequency = asciCharFreqArr[asciCharVal];
				maxOccuringChar = str1.charAt(i);
			}
		}

		return maxOccuringChar;
	}
}

package com.dineshwork;

import java.util.Arrays;
import java.util.List;

public class MaxWordInSentence {

	public static void main(String[] args) {
	    System.out.println(solutionJava8("We test coders. Give us a try?") == 4);
	    System.out.println(solutionJava8("Forget  CVs..Save time . x x") == 2);
	    System.out.println(solutionJava8("Some some! time . x x") == 2);
	    
	    //System.out.println(solution("We test coders. Give us a try?"));
	    
	    System.out.println(solution("We test coders. Give us a try?"));
	    System.out.println(solution("Forget  CVs..Save time . x x"));
	    System.out.println(solution("Some some! time . x x"));
	}

	public static int solutionJava8(String str) {
	    return Arrays.stream(str.split("[.!?]"))
	    	      .map(String::trim)
	    	      .filter(s -> !s.isEmpty()) 
	    	      .mapToInt(s -> s.split("\\s+").length)
	    	      .max()
	    	      .orElse(0);

	}
	
	public static int solution(String str) {
		//System.out.println(Arrays.toString(str.split("[.!?]")));
		int maxWordCount = 0;
		
		String[] sentences = str.split("\\s*+(?:[.!?]\\s*+)+");
		List<String> sentenceList = Arrays.asList(sentences);
		
		for(String sentense : sentences) {
			String[] words = sentense.split("\\s+");
			
			if(maxWordCount < words.length) {
				System.out.println(Arrays.toString(words));
				maxWordCount = words.length;
			}
		}
		
	    return maxWordCount;
	}
}

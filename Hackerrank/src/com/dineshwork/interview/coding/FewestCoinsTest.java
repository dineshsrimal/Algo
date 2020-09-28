package com.dineshwork.interview.coding;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class FewestCoinsTest {
	public boolean containALL(String str) { // check whether string contain all character (a,b,c,d) or not.
		boolean flagA = false, flagB = false, flagC = false, flagD = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a')
				flagA = true;

			if (str.charAt(i) == 'b')
				flagB = true;

			if (str.charAt(i) == 'c')
				flagC = true;

			if (str.charAt(i) == 'd')
				flagD = true;
		}

		if (flagA && flagB && flagC && flagD)
			return true;
		return false;

	}

	public static void main(String[] args) {

		FewestCoinsTest obj = new FewestCoinsTest();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = input.length(), min = 1000000;

		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			if (input.charAt(i) == 'a')
				q.add(i); // all position of character 'a'.
		}
		Iterator value = q.iterator();
		while (value.hasNext()) {
			int index = q.peek();

			for (int i = 4; i < n; i++) // loop from min length i.e 4 to n.
			{ // check all substring starting with character 'a'.
				if (index + i <= n) {
					String substr2 = input.substring(index, index + i);
					if (obj.containALL(substr2)) {
						if (min > i - index + 1) {
							min = i; // get the minimum length.
						}
					}
				}
			}

			q.remove();

		}
		System.out.println(min);
	}
}

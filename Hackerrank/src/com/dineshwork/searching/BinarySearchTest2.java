package com.dineshwork.searching;

import java.util.Arrays;

public class BinarySearchTest2 {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 8, 5, 34, 9, 12, 76 };
		int[] sortedArr = Arrays.stream(arr).sorted().toArray();

		System.out.println(Arrays.toString(sortedArr));
		int findElement = 9;
		System.out.println("Find Element 12 JDK: " + Arrays.binarySearch(sortedArr, findElement));

		System.out.println("Find Element 12 Custom: " + binarySearch(sortedArr, findElement));
		
		System.out.println("Find Element 12 Custom Recursive: " + binarySearchRecursive(sortedArr, findElement, 0, sortedArr.length - 1));

		int found = Arrays.stream(arr).filter(e -> e == findElement).findAny().orElse(-1);

		System.out.println("Find Element 12 Streams: " + found);
	}

	public static int binarySearch(int[] arr, int element) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int mid = (left + right) / 2;

			if (arr[mid] == element) {
				return mid;
			}

			if (element < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

	public static int binarySearchRecursive(int[] arr, int value, int left, int right) {

		if (left > right) {
			return -1;
		}

		int mid = (left + right) / 2;

		if (arr[mid] == value) {
			return mid;
		}

		if (value < arr[mid]) {
			right = mid - 1;
		} else {
			left = mid + 1;
		}

		return binarySearchRecursive(arr, value, left, right);

	}

}

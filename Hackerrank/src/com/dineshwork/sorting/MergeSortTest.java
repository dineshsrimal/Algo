package com.dineshwork.sorting;

import java.util.Arrays;

public class MergeSortTest {

    public static void main(String[] args) {
        int[] arr = {15, 5, 24, 8, 1, 3, 16, 10, 20};
        int[] tempArr = new int[arr.length];
        mergeSort(arr, tempArr, 0, arr.length - 1); // use the divide and conquer technique. Divide array in to 2 halves and merge as a sorted list
        System.out.println("Sorted Array : " + Arrays.toString(tempArr));
    }

    private static void mergeSort(int[] array,int[] tempArr, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int mid = (lowerBound + upperBound) / 2;

            mergeSort(array, tempArr, lowerBound, mid);
            mergeSort(array, tempArr, mid + 1, upperBound);
            mergeHalves(array, tempArr, lowerBound, mid, upperBound);
        }
    }

    private static void mergeHalves(int[] array, int[] tempArray, int lowerBound, int mid, int upperBound) {
        //int[] tempArray = new int[array.length];
        int k = lowerBound;
        int size = (upperBound - lowerBound) + 1;
        int leftStart = lowerBound;
        int rightStart = mid + 1;

        while (leftStart <= mid && rightStart <= upperBound) {

            if (array[leftStart] <= array[rightStart]) {
                tempArray[k] = array[leftStart];
                System.out.println("sorted arr element " + k + " : " + tempArray[k]);
                leftStart++;
            } else {
                tempArray[k] = array[rightStart];
                System.out.println("sorted arr element " + k + " : " + tempArray[k]);
                rightStart++;
            }

            k++;
        }

        // add the left over element of any half to the resulting array
        if (leftStart > mid) {
            while (rightStart <= upperBound) {
                tempArray[k] = array[rightStart];
                System.out.println("sorted arr element " + k + " : " + tempArray[k]);
                rightStart++;
                k++;
            }
        } else {
            while (leftStart <= mid) {
                tempArray[k] = array[leftStart];
                System.out.println("sorted arr element " + k + " : " + tempArray[k]);
                leftStart++;
                k++;
            }
        }

        System.arraycopy(tempArray, lowerBound, array, lowerBound, size);
    }

}

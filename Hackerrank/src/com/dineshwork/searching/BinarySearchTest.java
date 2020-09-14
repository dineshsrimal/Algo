package com.dineshwork.searching;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8, 10, 15, 16, 20, 24};
        int idx = binarySearch(array, 20, 0, array.length -1);
        System.out.println("Element found in Array at index : " + idx);

        int idxRec = binarySearchRecursive(array, 20, 0, array.length -1);
        System.out.println("Element found in Array at index : " + idxRec);
    }

    /***
     * Non recursive solution
     * @param array
     * @param value
     * @param leftStart
     * @param rightEnd
     * @return
     */
    private static int binarySearch(int[] array, int value, int leftStart, int rightEnd) {
        int mid;
        int index = -1;

        while(leftStart < rightEnd) {
            mid = (leftStart + rightEnd) / 2;

            if(value == array[mid]) {
                index = mid;
                break;
            }else if(value < array[mid]) {
                rightEnd = mid - 1;
            }else{
                leftStart = mid + 1;
            }
        }

        return index;
    }

    /***
     * Recursive solution
     * @param array
     * @param value
     * @param leftStart
     * @param rightEnd
     * @return
     */
    private static int binarySearchRecursive(int[] array, int value, int leftStart, int rightEnd) {
        int idx = -1;
        int mid = (leftStart + rightEnd) / 2;

        if(leftStart > rightEnd) {
            return -1;
        }

        if(value == array[mid]) {
            return mid;
        }else if(value < array[mid]) {
            rightEnd = mid - 1;
        }else{
            leftStart = mid + 1;
        }

        return binarySearchRecursive(array, value, leftStart, rightEnd);
    }

}

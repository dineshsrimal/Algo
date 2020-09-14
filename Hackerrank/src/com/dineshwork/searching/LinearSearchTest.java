package com.dineshwork.searching;

public class LinearSearchTest {

    public static void main(String[] args) {
        int[] array = {15, 5, 24, 8, 1, 3, 16, 10, 20};
        findElement(array, 3);
    }

    private static void findElement(int[] array, int element) {
        int index = -1;

        for(int i=0; i < array.length; i++) {
            if(array[i]  == element) {
                index = i;
                System.out.println("Found element in Array at index : " + index);
                break;
            }
        }
    }
}

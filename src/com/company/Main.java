package com.company;

public class Main {

    public static void main(String[] args) {
int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        LinearSearch.linearSearch(arr, -1);
        BinarySearch.binarySearch(arr, 51);

    }
}

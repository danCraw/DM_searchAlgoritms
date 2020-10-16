package com.company;

public class LinearSearch {
    public static void linearSearch(int arr[], int elementToSearch) {
        int k = 0;
        for (int index = 0; index < arr.length; index++) {
            k++;
            if (arr[index] == elementToSearch) {
                return;
            }
        }
        System.out.println("Количество сравнений " + k);
    }
}

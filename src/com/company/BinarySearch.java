package com.company;

public class BinarySearch {
    public static void binarySearch(int arr[], int elementToSearch) {

        int k = 0;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            k++;
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                System.err.println("Количество сравнений " + k);
                return;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else {
                if (arr[middleIndex] < elementToSearch) {
                    firstIndex = middleIndex + 1;
                }

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
                else if (arr[middleIndex] > elementToSearch) {
                    lastIndex = middleIndex - 1;
                }
            }
        }
        System.out.println("Количество сравнений " + k);
    }
}

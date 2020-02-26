package ru.job4j.array;

public class Min {

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            // проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
            min = array[i] < min ? array[i] : min;
        }
        return min;
    }
}

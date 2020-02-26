package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length -1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length - 1);
            if (index > i) {
                SwitchArray.swap(data, i, index);
            }
        }
        return data;
    }
}

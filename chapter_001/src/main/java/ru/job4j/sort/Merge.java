package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int lcount = 0;
        int rcount = 0;
        for (int i = 0; i < rsl.length; i++) {
            if ((rcount == right.length) || (lcount < left.length) && (left[lcount] <= right[rcount])) {
                rsl[i] = left[lcount];
                lcount++;
            } else {
                rsl[i] = right[rcount];
                rcount++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5, 6, 7},
                new int[] {2, 4, 7, 11}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
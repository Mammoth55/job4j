package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MatrixToList {

    public static void main(String[] args) {
        Integer[][] dim = {
                {1, 3, 7},
                {5, 2, 0},
                {8, 1, 4},
                {0, 9, 6}
        };
        List<Integer> list
                = Arrays.stream(dim).flatMap(e -> Arrays.stream(e)).collect(Collectors.toList());
        System.out.println(list);
    }
}
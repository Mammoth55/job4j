package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] sLeft = left.split("[.]");
        String[] sRight = right.split("[.]");
        return Integer.parseInt(sLeft[0]) - Integer.parseInt(sRight[0]);
    }
}
package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int rsl;
        int lengthLeft = left.length();
        int lengthRight = right.length();
        for (int i = 0; i < Math.min(lengthLeft, lengthRight); i++) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                return rsl;
            }
        }
        return lengthLeft == lengthRight ? 0 : lengthLeft > lengthRight ? 1 : -1;
    }
}
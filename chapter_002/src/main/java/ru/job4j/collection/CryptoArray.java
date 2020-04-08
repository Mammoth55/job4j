package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CryptoArray {

    public static String crypto(String size, String inString) {
        List<String> inArray = new ArrayList<>();
        inArray = Arrays.asList(inString.split("[ ]"));
        String outString = "";
        int counter = 0;
        String current = "";
        for (String s : inArray) {
            if (counter == 0) {
                current = s;
                counter++;
            } else {
                if (s.equals(current)) {
                    counter++;
                } else {
                    outString += counter + " " + current + " ";
                    current = s;
                    counter = 1;
                }
            }
        }
        outString += counter + " " + current + " ";
        return outString;
    }
}

package ru.job4j.collection;

import java.util.*;

public class Departments {

    private static final List<String> DEPARTMENTS = new ArrayList(Arrays.asList(
            "K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2",
            "K2", "K2/SK1/SSK1", "K2/SK1/SSK2"));

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.length() > 0) {
                    start += "/";
                }
                start += el;
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }

    public static void main(String[] args) {
        List<String> deps = fillGaps(DEPARTMENTS);
        System.out.println(deps);
        sortAsc(deps);
        System.out.println(deps);
        sortDesc(deps);
        System.out.println(deps);
    }
}
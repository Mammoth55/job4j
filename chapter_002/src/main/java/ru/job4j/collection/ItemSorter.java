package ru.job4j.collection;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("222"),
                new Item("111"),
                new Item("333")
        );
        System.out.println(items);
        Collections.sort(items, new SortByNameItemUp());
        System.out.println(items);
        Collections.sort(items, new SortByNameItemDown());
        System.out.println(items);
    }
}
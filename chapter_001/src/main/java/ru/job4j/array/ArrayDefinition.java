package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Slava";
        names[1] = "Tanya";
        names[2] = "Alena";
        names[3] = "Nikita";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}

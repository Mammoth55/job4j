package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               table[i][j] = (i + 1) * (j + 1);
               // System.out.print(table[i][j] + ", "); проверка заполнения
            }
            // System.out.println(); CRLF
        }
        return table;
    }

    public static void main(String[] args) {
        int size = 9;
        int[][] dim = multiple(size);
    }
}

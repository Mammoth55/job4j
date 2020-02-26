package ru.job4j.array;

public class BarleyBreak {

    public static void main(String[] args) {
        int[][] dim = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dim[i][j] = i * 3 + j + 1;
                // System.out.print(dim[i][j]); проверка заполнения
            }
            // System.out.println(); CRLF
        }
    }
}

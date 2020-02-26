package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {

        // boolean result = false;
        // проверить. что массив word имеет последние элементы одинаковые с post
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Clean code", 499);
        books[1] = new Book("Grock Algoritm", 669);
        books[2] = new Book("Java Manual", 999);
        books[3] = new Book("Head First Java", 770);
        for (Book i : books) {
            System.out.println(i.getName() + ", pages: " + i.getPages());
        }
        Book book = new Book();
        book = books[0];
        books[0] = books[3];
        books[3] = book;
        System.out.println();
        for (Book i : books) {
            System.out.println(i.getName() + ", pages: " + i.getPages());
        }
        System.out.println();
        for (Book i : books) {
            if (i.getName() == "Clean code") {
                System.out.println(i.getName() + ", pages: " + i.getPages());
            }
        }
    }
}

package ru.job4j.oop;

public class Student {

    public void music() {
        System.out.println("Tra ta ta");
    }

    public void song() {
        System.out.println("I beliiieve I can flyyy...");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.song();
        petya.music();
        petya.song();
        petya.music();
        petya.song();
    }
}

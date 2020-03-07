package ru.job4j.tracker;

public class Animal {

    private String name;

    public Animal() {
        super();
        System.out.println("Class Animal");
    }

    public Animal(String nick) {
        super();
        this.name = nick;
        System.out.println("Class Animal with Nick " + nick);
    }
}

package ru.job4j.tracker;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("Class Predator");
    }

    public Predator(String nick) {
        super(nick);
        System.out.println("Class Predator with Nick " + nick);
    }
}

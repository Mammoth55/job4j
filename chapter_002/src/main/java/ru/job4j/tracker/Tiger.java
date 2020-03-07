package ru.job4j.tracker;

public class Tiger extends Predator {

    public Tiger() {
        super();
        System.out.println("Class Tiger");
    }

    public Tiger(String nick) {
        super(nick);
        System.out.println("Class Tiger with Nick " + nick);
    }
}

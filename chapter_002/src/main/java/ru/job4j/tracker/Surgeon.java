package ru.job4j.tracker;

public class Surgeon extends Doctor {

    private int operationCounter;

    public Surgeon(String name, String surname, String education, String birthday, boolean intern, int operationCounter) {
        super(name, surname, education, birthday, intern);
        this.operationCounter = operationCounter;
    }

    public int getOperationCounter() {
        return this.operationCounter;
    }
}

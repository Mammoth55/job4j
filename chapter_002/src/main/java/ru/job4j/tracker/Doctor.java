package ru.job4j.tracker;

public class Doctor extends Profession {

    private boolean intern;

    public Doctor(String name, String surname, String education, String birthday, boolean intern) {
        super(name, surname, education, birthday);
        this.intern = intern;
    }

    public boolean getIntern() {
        return this.intern;
    }
}

package ru.job4j.tracker;

public class Dentist extends Doctor {

    private String dentSpecialization;

    public Dentist() {
    }

    public Dentist(String name, String surname, String education, String birthday, boolean intern, String dentSpecialization) {
        super(name, surname, education, birthday, intern);
        this.dentSpecialization = dentSpecialization;
    }

    public String getDentSpecialization() {
        return this.dentSpecialization;
    }
}

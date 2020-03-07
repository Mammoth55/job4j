package ru.job4j.tracker;

public class Programmer extends Engineer {

    private String baseProgLanguage;

    public Programmer() {
    }

    public Programmer(String name, String surname, String education, String birthday, String techSkills, String baseProgLanguage) {
        super(name, surname, education, birthday, techSkills);
        this.baseProgLanguage = baseProgLanguage;
    }

    public String getBaseProgLanguage() {
        return this.baseProgLanguage;
    }
}

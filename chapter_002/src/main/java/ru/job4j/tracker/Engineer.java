package ru.job4j.tracker;

public class Engineer extends Profession {

    private String techSkills;

    public Engineer(String name, String surname, String education, String birthday, String techSkills) {
        super(name, surname, education, birthday);
        this.techSkills = techSkills;
    }

    public String getTechSkills() {
        return this.techSkills;
    }
}

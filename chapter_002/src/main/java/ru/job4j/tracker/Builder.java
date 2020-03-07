package ru.job4j.tracker;

public class Builder extends Engineer {

    private int buildingCounter;

    public Builder(String name, String surname, String education, String birthday, String techSkills, int buildingCounter) {
        super(name, surname, education, birthday, techSkills);
        this.buildingCounter = buildingCounter;
    }

    public int getBuildingCounter() {
        return this.buildingCounter;
    }
}

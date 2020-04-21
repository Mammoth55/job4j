package ru.job4j.stream;

public class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName()) != 0
                ? this.getName().compareTo(o.getName())
                : this.getScore() - o.getScore();
    }
}
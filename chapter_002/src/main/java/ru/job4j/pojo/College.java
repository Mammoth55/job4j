package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Mamontoff Viacheslav Vladimirovich");
        student.setGroup("Mathematic-31");
        student.setDateIn("01.08.1993");
        System.out.println(student.getFio());
        System.out.println(student.getGroup());
        System.out.println(student.getDateIn());
    }
}

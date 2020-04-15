package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> students = List.of(
            new Student("Ivanov", 55),
            new Student("Mamontov", 40),
            new Student("Arsentev", 100)
    );

    public List<Student> collecting(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
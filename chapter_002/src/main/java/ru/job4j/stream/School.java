package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {

    public List<Student> collecting(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    public Map<String, Student> convertToMap(List<Student> students) {
        return students.stream().distinct().collect(
                Collectors.toMap(
                        e -> e.getName(),
                        e -> e));
    }

    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().flatMap(Stream::ofNullable).sorted().filter(student -> student.getScore() > bound).collect(Collectors.toList());
    }
}
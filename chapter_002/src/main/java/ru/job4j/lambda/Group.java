package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

    static class Holder {
        String section, name;

        Holder(String section, String name) {
            this.name = name;
            this.section = section;
        }
    }

    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(student ->
                student.getUnits().stream()
                        .map(group -> new Holder(group, student.getName()))
        ).collect(Collectors.groupingBy(t -> t.section,
                Collector.of(HashSet::new,
                        (set, el) -> {
                            set.add(el.name);
                        },
                        (left, right) -> {
                            left.addAll(right);
                            return left;
                        }
                )
                )
        );
    }
}
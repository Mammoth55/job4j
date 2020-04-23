package ru.job4j.lambda;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GroupTest {

    List<Student> students;

    @Before
    public void dataInit() {
        students = List.of(
                new Student("Ivanov", Set.of("chess", "volleyball")),
                new Student("Mamontov", Set.of("volleyball", "soccer", "karate")),
                new Student("Arsentev", Set.of("chess", "karate"))
        );
    }

    @Test
    public void whenSections() {
        Group group = new Group();
        Map<String, Set<String>> map = group.sections(students);
        assertThat(map.get("chess").size(), is(2));
    }
}

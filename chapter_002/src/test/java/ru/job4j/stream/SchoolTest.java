package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    List<Student> students;

    @Before
    public void dataInit() {
        students = List.of(
                new Student("Ivanov", 55),
                new Student("Mamontov", 40),
                new Student("Arsentev", 100)
        );
    }

    @Test
    public void whenClassA() {
        School school = new School();
        List<Student> list = school.collecting(students, student ->
                student.getScore() <= 100 && student.getScore() >= 70);
        assertThat(list.get(0).getName(), is("Arsentev"));
    }

    @Test
    public void whenClassB() {
        School school = new School();
        List<Student> list = school.collecting(students, student ->
                student.getScore() < 70 && student.getScore() >= 50);
        assertThat(list.get(0).getName(), is("Ivanov"));
    }

    @Test
    public void whenClassC() {
        School school = new School();
        List<Student> list = school.collecting(students, student ->
                student.getScore() < 50 && student.getScore() >= 0);
        assertThat(list.get(0).getName(), is("Mamontov"));
    }

    @Test
    public void whenConvertToMap() {
        School school = new School();
        Map<String, Student> map = new HashMap<>();
        map = school.convertToMap(students);
        assertThat(map.get("Mamontov").getScore(), is(40));
    }
}
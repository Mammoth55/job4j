package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void whenClassA() {
        School school = new School();
        List<Student> list = school.collecting(school.students, student ->
                student.getScore() <= 100 && student.getScore() >= 70);
        assertThat(list.get(0).getName(), is("Arsentev"));
    }

    @Test
    public void whenClassB() {
        School school = new School();
        List<Student> list = school.collecting(school.students, student ->
                student.getScore() < 70 && student.getScore() >= 50);
        assertThat(list.get(0).getName(), is("Ivanov"));
    }

    @Test
    public void whenClassC() {
        School school = new School();
        List<Student> list = school.collecting(school.students, student ->
                student.getScore() < 50 && student.getScore() >= 0);
        assertThat(list.get(0).getName(), is("Mamontov"));
    }
}
package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByPriorityUp() {
        Comparator<Job> cmpNamePriority = new JobSortByPriorityUp();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityDown() {
        Comparator<Job> cmpNamePriority = new JobSortByPriorityDown();
        int rsl = -cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameUp() {
        Comparator<Job> cmpNamePriority = new JobSortByNameUp();
        int rsl = -cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameDown() {
        Comparator<Job> cmpNamePriority = new JobSortByNameDown();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByName() {
        Comparator<Job> cmpNamePriority = new JobSortByNameDown().thenComparing(new JobSortByPriorityDown());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobSortByNameDown().thenComparing(new JobSortByPriorityDown());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 4),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}
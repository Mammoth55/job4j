package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    private List<Profile> profiles;

    @Before
    public void dataInit() {
        profiles = List.of(
                new Profile(new Address("Moscow", "Lenina", 11, 5)),
                new Profile(new Address("Omsk", "Komarova", 15, 33)),
                new Profile(new Address("Moscow", "Lenina", 11, 5)),
                new Profile(new Address("Astana", "Gagarina", 4, 1)),
                new Profile(new Address("Moscow", "Lenina", 11, 5)),
                new Profile(new Address("Omsk", "Komarova", 15, 33)),
                new Profile(new Address("Norilsk", "Komarova", 105, 3))
        );
    }

    @Test
    public void whenCollecting() {
        Profiles pro = new Profiles();
        List<Address> list = pro.collectSortedAddress(profiles);
        assertThat(list.get(3).getCity(), is("Omsk"));
    }
}
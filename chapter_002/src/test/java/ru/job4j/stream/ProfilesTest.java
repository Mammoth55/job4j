package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    List<Profile> profiles;

    @Before
    public void dataInit() {
        profiles = List.of(
                new Profile(new Address("Moscow", "Lenina", 11, 5)),
                new Profile(new Address("Omsk", "Komarova", 15, 33)),
                new Profile(new Address("Perm", "Gagarina", 4, 1))
        );
    }

    @Test
    public void whenCollecting() {
        Profiles pro = new Profiles();
        List<Address> list = pro.collectAddress(profiles);
        assertThat(list.get(2).getCity(), is("Perm"));
    }
}
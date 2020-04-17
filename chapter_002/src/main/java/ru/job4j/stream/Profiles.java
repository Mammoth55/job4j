package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collectSortedAddress(List<Profile> profiles) {
        List<Address> out = profiles.stream().distinct().map(
                profile -> profile.getAddress()
        ).collect(Collectors.toList());
        Collections.sort(out);
        return out;
    }
}
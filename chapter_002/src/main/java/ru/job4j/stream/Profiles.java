package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collectSortedAddress(List<Profile> profiles) {
        Comparator<Profile> comparator
                = (left, right) -> left.getAddress().getCity().compareTo(right.getAddress().getCity());
        return profiles.stream().sorted(comparator).distinct().map(
                profile -> profile.getAddress()).collect(Collectors.toList());
    }
}
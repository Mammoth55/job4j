package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    List<Address> collectAddress(List<Profile> profiles) {
        List<Address> out = profiles.stream().map(
                profile -> profile.getAddress()
        ).collect(Collectors.toList());
        return out;
    }
}
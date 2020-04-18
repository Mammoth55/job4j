package ru.job4j.stream;

import java.util.Objects;

public class Profile {

    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) o;
        return getAddress().getHome() == profile.getAddress().getHome()
                && getAddress().getApartment() == profile.getAddress().getApartment()
                && getAddress().getCity().equals(profile.getAddress().getCity())
                && getAddress().getStreet().equals(profile.getAddress().getStreet());
    }
}
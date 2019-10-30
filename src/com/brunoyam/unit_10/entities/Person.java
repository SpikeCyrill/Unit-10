package com.brunoyam.unit_10.entities;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String secondName;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                surname.equals(person.surname) &&
                secondName.equals(person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, secondName);
    }

    @Override
    public String toString() {
        return surname.concat(" ").concat(name).concat(" ").concat(secondName);
    }
}

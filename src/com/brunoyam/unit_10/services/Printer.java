package com.brunoyam.unit_10.services;

import com.brunoyam.unit_10.entities.Person;

import java.util.Collection;

public class Printer {

    public static void printPersons(Collection<Person> personsCollection) {
        System.out.println();
        System.out.println("Новый список:");
        personsCollection.stream().map(Person::toString).forEach(System.out::println);
    }

}

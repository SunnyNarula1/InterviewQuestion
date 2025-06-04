package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntEyfdd {
	public static void main(String[] args) {
        List<Person> list = Arrays.asList(
            new Person("Alice", Arrays.asList("9123456789", "8123456789")),
            new Person("Bob", Arrays.asList("9234567890")),
            new Person("Charlie", Arrays.asList("9345678901", "7123456789"))
        );

        // Get list of person names
        List<String> listOfPersonName = list.stream().map(Person::getPersonName).collect(Collectors.toList());

        // Get distinct phone numbers starting with '9'
        List<String> listOfPersonPhoneNo = list.stream().flatMap(p -> p.getPhone().stream())
            .filter(phone -> phone.startsWith("9"))
            .distinct()
            .collect(Collectors.toList());

        System.out.println("Names: " + listOfPersonName);
        System.out.println("Phone numbers starting with '9': " + listOfPersonPhoneNo);
    }

}

class Person {
    private String personName;
    private List<String> phone;

    // Constructor
    public Person(String personName, List<String> phone) {
        this.personName = personName;
        this.phone = phone;
    }

    // Getters
    public String getPersonName() {
        return personName;
    }

    public List<String> getPhone() {
        return phone;
    }
}

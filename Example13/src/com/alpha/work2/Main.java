package com.alpha.work2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Ivan");
        person.setLastName("Ivanov");
        try {
            person.setAge(130);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

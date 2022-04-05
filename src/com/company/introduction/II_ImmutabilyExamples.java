package com.company.introduction;

public class II_ImmutabilyExamples {
    public static void main(String[] args) {
        int x = 5;
        x = 6; // Mutation
        final int y = 10; // Immutable

        // Mutable
        Person p = new Person(30, "Ali");
        p.setAge(40);

        // Immutable
        ImmutablePerson ip = new ImmutablePerson(30, "Ali");
        ImmutablePerson updatedIp = new ImmutablePerson(40, "Ali");
    }
}

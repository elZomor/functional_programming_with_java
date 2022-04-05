package com.company.introduction;

public class ImmutablePerson {
    private final int age;
    private final String name;

    public ImmutablePerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

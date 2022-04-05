package com.company.introduction;

public class III_FunctionPurityExamples {
    public static void main(String[] args) {
        // Impure function
        Person p = new Person(10, "Mohamed");
        System.out.println(p.toString());
        p.setName("Ali");
        System.out.println(p.toString());

        // Pure function
        ImmutablePerson ip = new ImmutablePerson(20, "Mohamed");
        System.out.println(ip.toString());

        // Pure function
        System.out.println(add(3, 2));
    }

    public static int add (int x, int y) {
        return x + y ;
    }
}

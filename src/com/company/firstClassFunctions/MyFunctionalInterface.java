package com.company.firstClassFunctions;

@FunctionalInterface
public interface MyFunctionalInterface {
    String greet(String name);

    static void thisIsStatic() {
        System.out.println("Static method");
    }

    default void thisIsDefault() {
        System.out.println("Default method");
    }
}

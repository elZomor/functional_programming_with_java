package com.company.firstClassFunctions;

import java.util.function.Function;

public class II_Lambdas {

    static class ImplementInterface implements MyFunctionalInterface {

        @Override
        public String greet(String name) {
            return "Hello, " + name;
        }
    }

    public static void main(String[] args) {
        // Using solid class
        ImplementInterface implementInterface = new ImplementInterface();

        // Using anonymous class
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public String greet(String name) {
                return "Hello, " + name;
            }
        };

        // Using Lambdas
        MyFunctionalInterface myFunctionalInterface1 = (name) -> {
            return "Hello, " + name;
        };


    }
}

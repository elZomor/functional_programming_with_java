package com.company.firstClassFunctions;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class IV_MethodReferences {
    static class Cat implements Animal{

        @Override
        public void makeSound() {
            System.out.println("MEAAAAOW");
        }
    }
    public static void main(String[] args) {
        // Referencing to static method
        Consumer<String> print = System.out::println;
        print.accept("Hello");

        // Referencing to create instance
        Supplier<Cat> print1 = Cat::new;
        Cat c = print1.get();

        // Reference to get method from class
        VoidNoArgFunction print2 = c::makeSound;
        print2.apply();

        // Reference to java objects
        BiFunction<Integer, Integer, Integer> getSum = Integer::sum;
        System.out.println(getSum.apply(2, 3));

    }
}

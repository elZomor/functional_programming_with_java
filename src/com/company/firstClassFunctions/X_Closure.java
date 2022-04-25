package com.company.firstClassFunctions;

import java.util.function.Function;
import java.util.function.Supplier;

public class X_Closure {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> multiply =
                x -> y -> x * y ;
        Function<Integer, Integer> multiplyBy5 = multiply.apply(5);
        System.out.println(multiplyBy5.apply(10));

        // Another example
        Function<String, Supplier<String>> greetBase = name -> () -> "Hello, " + name;
        Supplier<String> greet = greetBase.apply("Mohamed");
        System.out.println(greet.get());

    }

}

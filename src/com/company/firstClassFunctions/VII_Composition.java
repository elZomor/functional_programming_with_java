package com.company.firstClassFunctions;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class VII_Composition {
    public static void main(String[] args) {
        Function<Float, Float> calcPerc = x -> (x / 350) * 100;
        Function<Float, String> checkSuccess = x -> {
            if (x > 0.85) {
                return "A";
            }else if (x > 0.75) {
                return "B";
            }else if (x > 0.65) {
                return "C";
            }else if (x > 0.5) {
                return "D";
            }else {
                return "F";
            }
        };
        Function<String, String> finalResult = str -> "Your final result is: " + str;

        System.out.println(calcPerc.andThen(checkSuccess).andThen(finalResult).apply(280f));
        System.out.println(finalResult.compose(checkSuccess).compose(calcPerc).apply(280f));




    }
}

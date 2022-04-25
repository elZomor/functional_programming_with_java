package com.company.advancedTopics;

import java.util.function.BiFunction;
import java.util.function.Function;

public class I_HigherOrderFunctions {
    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;
        BiFunction<Float, Float, Float> divideInternalCheck = (x, y) -> {
            if (y == 0) {
                System.out.println("CAN NOT DIVIDE BY ZERO");
                return 0f;
            }
            return x / y;
        };
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> divideCheckNonZero =
                func -> (x, y) -> {
                    if (y == 0) {
                        System.out.println("ZERO EXCEPTION");
                        return 0f;
                    }
                    return func.apply(x, y);
                };
//        BiFunction<Float, Float, Float> divideSafe = divideCheckNonZero.apply(divide);
//        System.out.println(divideSafe.apply(5f,0f));
        // Check 1 ==> y != 0
        // Check 2 ==> x & y > 0
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> divideCheckPositive =
                func -> (x, y) -> {
                    if (x > 0 && y > 0) {
                        return func.apply(x, y);
                    }
                    System.out.println("NOT POSITIVE");
                    return 0f;
                };
        BiFunction<Float, Float, Float> divideSafePositive = divideCheckPositive.apply(divide);
        BiFunction<Float, Float, Float> divideSafe = divideCheckNonZero.apply(divideSafePositive);
        System.out.println(divideSafe.apply(-5f,0f));
    }
}

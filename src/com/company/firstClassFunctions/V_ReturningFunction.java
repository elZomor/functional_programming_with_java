package com.company.firstClassFunctions;

import java.util.function.Function;

public class V_ReturningFunction {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> multiply = x -> y -> x * y;
        Function<Integer, Integer> multiplyFive = multiply.apply(5);
        Integer SixMultiplyFive = multiplyFive.apply(6);
        Function<Integer, Integer> multiplyFour = multiply.apply(4);
        Integer SixMultiplyFour = multiplyFour.apply(6);
        System.out.println("6 * 5 = " + SixMultiplyFive);
        System.out.println("6 * 4 = " + SixMultiplyFour);

    }
}

package com.company.firstClassFunctions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class III_PassingFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addFunc = (x, y) -> x + y ;
        BiFunction<Integer, Integer, Integer> subFunc = (x, y) -> x - y ;
        TriFunction<BiFunction<Integer, Integer, Integer>, Integer, Integer, Integer> triFunc =
                (func, x, y) -> func.apply(x, y);
        System.out.println("for numbers (2, 3) The summation is: " + triFunc.apply(addFunc, 2, 3)
                    + " And the difference is: " + triFunc.apply(subFunc, 2, 3));

        System.out.println("for numbers (2, 3) The summation is: " + myMethod(addFunc, 2, 3)
                + " And the difference is: " + myMethod(subFunc, 2, 3));
    }

    static Integer myMethod (BiFunction<Integer, Integer, Integer> func, Integer x, Integer y) {
        return func.apply(x, y);
    }
}

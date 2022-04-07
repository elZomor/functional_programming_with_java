package com.company.introduction;

import java.util.function.Function;

public class IV_FirstClassFunction {
    static Integer sum (Integer x, Integer y) { return x + y;}

    public static void main(String[] args) {
        Integer i = 10;
        Integer sumResult = sum(i, 10);
        // Define function
        Function<Integer, Integer> addTwo = x -> 2 + x;
        // Pass function as arg
        Integer ii = multi(addTwo);
        // Return function
        Function<Integer, Function<Integer, Integer>> multiply = x -> y -> x * y ;
        Function<Integer, Integer> multiplyBySix = multiply.apply(6);
    }
    static Integer multi (Function<Integer, Integer> myFunc) {return  myFunc.apply(2);}
}

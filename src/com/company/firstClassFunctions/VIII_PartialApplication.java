package com.company.firstClassFunctions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class VIII_PartialApplication {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z ;

        Function<Integer, Function<Integer, Function<Integer, Integer>>> addPartial = x -> y -> z -> x + y + z ;
        Function<Integer,Function<Integer, Integer>> add5 = addPartial.apply(5);
        Function<Integer, Integer> add5And6 = add5.apply(6);
        System.out.println(add5And6.apply(10));

        Function<Integer, BiFunction<Integer, Integer, Integer>> addPartialTwo = x -> (y, z) -> x + y + z ;
        BiFunction<Integer, Integer, Integer> add10 = addPartialTwo.apply(10);
        System.out.println(add10.apply(5,6));


    }
}

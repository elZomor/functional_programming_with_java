package com.company.firstClassFunctions;

import java.util.function.*;

public class II_Function {


    public static void main(String[] args) {
        Function<Integer, String> addTwoFunc = x -> x + " + 2 = " + (x + 2);
        System.out.println(addTwo(5));
        System.out.println(addTwoFunc.apply(5));


        BiFunction<Integer, Integer, Integer> sumTwo = (x, y) -> x + y;
        Supplier<Integer> supplier = () -> 5;
        Consumer<Integer> consumer = x -> System.out.println(x);
        UnaryOperator<Integer> unaryFunc = x -> x + 2;
        BinaryOperator<Integer> binaryFunc = (x, y) -> x + y ;
        Predicate<Integer> predicate = x -> x > 5;
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (x, y, z) -> x + y + z ;
        System.out.println(sumTwo.apply(2, 3));
        System.out.println(supplier.get());
        consumer.accept(10);
        System.out.println(unaryFunc.apply(10));
        System.out.println(binaryFunc.apply(20,10));
        System.out.println(predicate.test(10));
    }

    static String addTwo (Integer x) {
        return x + " + 2 = " + (x + 2);
    }
}

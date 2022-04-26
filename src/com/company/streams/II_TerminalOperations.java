package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class II_TerminalOperations {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        myList.stream().forEach(System.out::println);
        List<Integer> newList = myList.stream().collect(Collectors.toList());
        Integer sumOfList = myList.stream().reduce(0, Integer::sum);

        // Using Functions
        Consumer<Integer> printLine = System.out::println;
        myList.stream().forEach(printLine);


        BinaryOperator<Integer> sumTwo = Integer::sum; // Eq: (x, y) -> x + y
        Integer sumOfListFunc = myList.stream().reduce(0, sumTwo);

        // Collecting streams
        List<String> stringList = new ArrayList<>(Arrays.asList("Hello", "World", "This", "Is", "AMAAAAZINGGGG!"));
        String joining = stringList.stream()
                .collect(Collectors.joining(","));

        Long countingMoreThanFourCharacters = stringList.stream()
                .filter(s -> s.length() > 4)
                .collect(Collectors.counting());

        // Takes function, the arg of the function is the list in the map, the return type is the key of the map
        Map<Integer, List<String>> groupByLengthMap = stringList.stream()
                .collect(Collectors.groupingBy(s -> s.length()));

        // Takes predicate
        Map<Boolean, List<String>> isMoreThanThreeCharacters = stringList.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 3));


        System.out.println(groupByLengthMap);
        System.out.println(isMoreThanThreeCharacters);

    }
}

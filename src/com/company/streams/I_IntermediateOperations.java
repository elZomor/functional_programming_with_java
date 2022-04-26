package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class I_IntermediateOperations {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> doubledList = myList.stream().map(x -> 2 * x).toList();
        List<Integer> evenList = myList.stream().filter(x -> x % 2 == 0).toList();
        List<Integer> sortedList = myList.stream().sorted().toList();
        List<Integer> sortedListDesc = myList.stream().sorted(Comparator.reverseOrder()).toList();

        // Using functions
        Function<Integer, Integer> doubleFunction = x -> 2 * x;
        List<Integer> doubledListFunc = myList.stream().map(doubleFunction).toList();

        Predicate<Integer> filterEven = x -> x % 2 == 0;
        List<Integer> evenListFunc = myList.stream().filter(filterEven).toList();

        Comparator<Integer> reversedOrder = (x, y) -> x.compareTo(y);
        List<Integer> sortedListFunc = myList.stream().sorted(reversedOrder).toList();

    }
}

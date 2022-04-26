package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class III_AdvancedTopics {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // Merging both
        Integer sumOfEvenSquaredList = myList
                .stream()
                .map( x -> x*x)
                .map(x -> x * 3)
                .filter( x -> x % 2 == 0)
                .reduce(0, Integer::sum);

        // Parallel streams
        myList.parallelStream().forEach(System.out::println);
    }


}

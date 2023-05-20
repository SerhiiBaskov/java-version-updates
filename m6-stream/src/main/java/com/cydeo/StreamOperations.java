package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3);
//        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);

        // FILTER

        System.out.println("filter");
        list.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);

        // DISTINCT

        System.out.println("distinct");
        list.stream()
                .filter(i -> i%2==0)
                .distinct()
                .forEach(System.out::println);

        // LIMIT

        System.out.println("limit");
        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        // SKIP

        System.out.println("skip");
        list.stream()
                .filter(i -> i%2==0)
                .skip(1)
                .forEach(System.out::println);



    }
}

package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class CountNumberOfElements {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of add integers = " +count);

    }

    public static <T> int countIf(List<T> a, UnaryPredicate <T> p){
        int count = 0;
        for (T each : a) {
            if (p.test(each)) {
                count++;
            }
        }
        return count;
    }
}

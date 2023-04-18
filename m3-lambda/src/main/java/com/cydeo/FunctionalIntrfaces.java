package com.cydeo;

import com.cydeo.AppleTask.Apple;
import com.cydeo.AppleTask.ApplePredicate;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalIntrfaces {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return false;
            }
        };

        System.out.println("*****************PREDICATE********************");
        Predicate<Integer> lessThan = integer -> integer<18;
        System.out.println(lessThan.test(20));

        System.out.println("*****************CONSUMER********************");
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);






    }
}

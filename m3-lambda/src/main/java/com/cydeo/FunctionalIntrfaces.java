package com.cydeo;

import com.cydeo.AppleTask.Apple;
import com.cydeo.AppleTask.ApplePredicate;

import java.util.function.*;

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

        System.out.println("*****************BI CONSUMER********************");
        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println(a+b);
        sum.accept(10, 5);

        System.out.println("*****************FUNCTION********************");
        Function<String, String> fun = s -> "Hello " +s;
        System.out.println(fun.apply("Sydeo"));

        System.out.println("------------------------");
        Function<String, Integer> length = s -> s.length();
        System.out.println(length.apply("Wooden Spoon"));

        System.out.println("*****************BI FUNCTION********************");
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1+x2;
        System.out.println(func.apply(2, 3));

        System.out.println("*****************SUPPLIER********************");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}

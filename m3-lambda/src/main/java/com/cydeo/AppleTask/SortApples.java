package com.cydeo.AppleTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortApples {

    public static void main(String[] args) {

        Apple a1 = new Apple(Colour.GREEN, 150);
        Apple a2 = new Apple(Colour.YELLOW, 250);
        Apple a3 = new Apple(Colour.GREEN, 120);
        Apple a4 = new Apple(Colour.RED, 205);
        Apple a5 = new Apple(Colour.YELLOW, 155);
        Apple a6 = new Apple(Colour.GREEN, 210);

        List<Apple> list = Arrays.asList(a1, a2, a3, a4, a5,  a6);
        List<Apple> greenApples = findAll(list, new AppleGreenColorPredicate());
        List<Apple> heavyApples = findAll(list, new AppleHeavyPredicate());

        System.out.println("All inventory: "+list);
        System.out.println("Green apples: "+greenApples);
        System.out.println("Apples that heavy then 200g: "+heavyApples);

    }

    public static List<Apple> findAll(List<Apple> a, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : a) {
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}

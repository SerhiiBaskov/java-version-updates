package com.cydeo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        Apple a1 = new Apple(Colour.GREEN, 150);
        Apple a2 = new Apple(Colour.YELLOW, 250);
        Apple a3 = new Apple(Colour.GREEN, 120);
        Apple a4 = new Apple(Colour.RED, 205);
        Apple a5 = new Apple(Colour.YELLOW, 155);
        Apple a6 = new Apple(Colour.GREEN, 210);

        List<Apple> inventory = Arrays.asList(a1, a2, a3, a4, a5,  a6);
        System.out.println(inventory);

        Comparator<Apple> sortApple = Comparator.comparing((Apple apple) -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        Comparator<Apple> sortApple2 = Comparator.comparing(Apple::getWeight);
        inventory.sort(sortApple2);
        System.out.println(inventory);

    }
}

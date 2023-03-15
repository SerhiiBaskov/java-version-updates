package com.cydeo.AppleTask;

public class ColorPredicate implements ApplePredicate<String>{
    @Override
    public boolean test(Apple apple, String colour) {
        return apple.colour == colour;
    }
}

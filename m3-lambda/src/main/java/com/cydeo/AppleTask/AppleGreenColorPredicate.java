package com.cydeo.AppleTask;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColour().equals(Colour.GREEN);
    }
}

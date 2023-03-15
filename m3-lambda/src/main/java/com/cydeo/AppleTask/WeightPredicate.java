package com.cydeo.AppleTask;

public class WeightPredicate implements ApplePredicate<Double>{
    @Override
    public boolean test(Apple apple, Double weight) {
        return apple.weight > weight;
    }
}

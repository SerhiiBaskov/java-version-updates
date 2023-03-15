package com.cydeo.AppleTask;

public interface ApplePredicate<T> {
public boolean test(Apple apple, T obj);
}
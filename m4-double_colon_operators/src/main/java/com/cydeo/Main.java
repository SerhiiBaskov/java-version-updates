package com.cydeo;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

         Predicate<Integer> pred = p -> p % 2 == 0;

        Calculate sum = (x, y) -> System.out.println("Sum = " +(x+y));
        Calculate s1 = (x, y) -> Calculator.findSun(x, y);

        // Reference to a Static Method
        Calculate s2 = Calculator::findSun;
        s2.calculate(10, 20);


        // Reference to an Instance Method
        Calculator obj = new Calculator();
        Calculate m1 = obj::findMultiply;
        // or
        Calculate m2 = new Calculator()::findMultiply;


        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);

        BiFunction<String, Integer, String> func1 = String::substring;


        Function<Integer, Double> b = new MyClass() :: method;
        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;


    }
}

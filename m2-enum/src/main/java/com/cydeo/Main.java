package com.cydeo;

public class Main {

    public static void main(String[] args) {

        System.out.println("How to get access to a constant");

        Currency c  = Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("How to get all constants");

        Currency [] currencies = Currency.values();

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        Calculate(5, 2, MathOperator.PLUS);

        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.PENNY.ordinal());  // getting index number


    }

    public static void Calculate (int a, int b, MathOperator c){
        switch (c){
            case MULTIPLICATION:
                System.out.println("Result is " +(a*b));
                break;
            case DIVISION:
                System.out.println("Result is " +(a/b));
                break;
            case PLUS:
                System.out.println("Result is " +(a+b));
                break;
            case MINUS:
                System.out.println("Result is " +(a-b));
                break;
        }
    }

}

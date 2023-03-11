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


    }

}

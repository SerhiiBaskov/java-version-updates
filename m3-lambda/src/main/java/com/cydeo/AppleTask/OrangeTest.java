package com.cydeo.AppleTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Colour.GREEN));
        inventory.add(new Orange(100, Colour.RED));
        inventory.add(new Orange(200, Colour.GREEN));
        inventory.add(new Orange(50, Colour.RED));

        OrangeFormatter orangeWeight = orange -> "An orange of " +orange.getWeight() +"g";
        prettyPrintOrange(inventory, orangeWeight);

        prettyPrintOrange(inventory, orange -> "An orange of " +orange.getWeight() +"g");

        System.out.println("-------------------------------------------------------------");

        OrangeFormatter fancyFormatter = orange -> {
 //         if (orange.getWeight() < 150){
 //             return  "A light " +orange.getColour() +" orange";
 //           }else{
 //             return  "A heavy " +orange.getColour() +" orange";
 //           }

            String ch = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " +ch +" " +orange.getColour() + " orange";
        };

        prettyPrintOrange(inventory, fancyFormatter);
    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter) {

        for(Orange orange : inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }

    }

}

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

    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter) {

        for(Orange orange : inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }

    }

}

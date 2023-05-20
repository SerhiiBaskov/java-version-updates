package com.cydeo.tasks.dishTask;

import java.util.Comparator;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print the length of the name of each dish

        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //Print three high caloric dish name (>300)

        DishData.getAll().stream()
                .filter(i->i.getCalories()>300)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted

        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);



    }
}

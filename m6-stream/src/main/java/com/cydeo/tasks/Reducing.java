package com.cydeo.tasks;

import com.cydeo.tasks.dishTask.Dish;
import com.cydeo.tasks.dishTask.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

//        int sum = 0;
//        for(int number : numbers){
//            sum = sum + number;
//        }

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);
        System.out.println(result2.get());

        System.out.println("Total calories of menu");

        int sumCalories = DishData.getAll().stream()
                .map(Dish::getCalories)
 //             .reduce(0, (a,b) -> a+b);
                .reduce(Integer::sum).get();
        System.out.println(sumCalories);

        //Max and min

        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min: " +min.get());
        System.out.println("Max: " +max.get());
        System.out.println("Sum: " +sum.get());

        // COUNT
        System.out.println("COUNT");

       long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);

    }
}

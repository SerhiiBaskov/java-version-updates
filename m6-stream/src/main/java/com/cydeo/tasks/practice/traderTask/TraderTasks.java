package com.cydeo.tasks.practice.traderTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TraderTasks {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );

 //  1. Find all transactions in the year 2011 and sort them by value(small to high)

        List<Integer> transactions2011 = transactions.stream()
                .filter(i -> i.getYear()==2011)
                .map(i->i.getValue())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(transactions2011);

//  2. What are all the unique cities where the traders work?

        System.out.println("--------------------------");

        transactions.stream()
                .map(t ->t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

// 3. Find all traders from Cambridge and sort them by name.

        System.out.println("-----------------------------");

        transactions.stream()
                .filter(i ->i.getTrader().getCity().equals("Cambridge"))
                .map(i -> i.getTrader().getName())
                .sorted()
                .distinct()
                .forEach(System.out::println);

// 4. Return a string of all traders’ names sorted alphabetically.

        System.out.println("---------------------------");

        String traders = transactions.stream()
                .map(i -> i.getTrader().getName())
                .sorted()
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println(traders);




    }
}

package com.cydeo.tasks.practice.traderTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

// 5. Are any traders based in Milan?

        System.out.println("----------------------------");

        if(transactions.stream().anyMatch(i -> i.getTrader().getCity().equals("Milan"))){
            System.out.println("There are traders in Milan");
        }else {
            System.out.println("There are no traders in Milan");
        }

// 6. Print the values of all transactions from the traders living in Cambridge.

        System.out.println("-------------------------------");

        transactions.stream()
                .filter(i -> i.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

// 7. What is the highest value of all the transactions?

        System.out.println("----------------------------------");

        transactions.stream()
                .map(Transaction::getValue)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .forEach(System.out::println);

        Optional<Transaction> maxValue = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue));

        System.out.println(maxValue.get().getValue());

// 8. Find the transaction with the smallest value.

        System.out.println("------------------------");

        Optional<Transaction> minValue = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));

        System.out.println(minValue.get());





    }
}

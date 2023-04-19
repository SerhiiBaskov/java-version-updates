package com.cydeo.UserTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Smith", 35));
        users.add(new User("Tom", "Evan", 25));
        users.add(new User("Emma", "Allard", 55));

        // Print all elements in the list

//        Predicate<User> all = user -> true;
        print(users, user -> true);

        System.out.println("----------------------------------------");

        //Print all people that last name starts with E
//        Predicate<User> p = user -> user.getLastName().startsWith("E");
        print(users, user -> user.getLastName().startsWith("E"));

    }
    // Write method

    private static void print (List<User> users, Predicate<User> p){
        for (User user : users) {
            if (p.test(user)){
                System.out.println(user);
            }
        }
    };


}

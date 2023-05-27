package com.cydeo.tasks.employeeTask;

import java.util.Collection;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("Print all emails");

        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print all phone numbers");

        EmployeeData.readAll()
//                .map(Employee::getEmpPhoneNumbers)
                .flatMap(Employee -> Employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print all phone numbers with Double Colon");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}

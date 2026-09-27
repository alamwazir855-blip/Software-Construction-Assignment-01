package Assignmet01;

import java.util.ArrayList;
import java.util.List;

public class Task2Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(
                new Developer("Ihsan Ullah", 80000, 10000)
        );

        employees.add(
                new SalesManager("Ali Khan", 70000, 200000, 0.05)
        );

        for (Employee employee : employees) {

            System.out.println(
                    employee.getName()
                    + " Final Pay: "
                    + employee.calculatePay()
            );
        }
    }
}
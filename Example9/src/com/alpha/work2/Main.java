package com.alpha.work2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("count =  " + employee.getNumberOfEmployees());

        Employee employee1 = new Employee("Peter", "Petrov", "admin",
                671234567);
        System.out.println("count = " + employee.getNumberOfEmployees());
    }
}

package com.alpha.work2;

public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private long telephone;

    private static int numberOfEmployees;
    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    {
        numberOfEmployees++;
    }

    public Employee() {
//        numberOfEmployees++;  --- удалили, потомучто добавили его вверху (строки 14-16)
    }

    public Employee(String firstName, String lastName, String occupation, long telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;

//        numberOfEmployees++;  --- удалили, потомучто добавили его вверху (строки 14-16)
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }
}

package com.company;

import java.util.Scanner;

public class Employee {
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getHireLevel() {
        return hireLevel;
    }

    public void setHireLevel(int hireLevel) {
        this.hireLevel = hireLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    private int ID = 0;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;
    private String firstName;
    private String DOB;
    private String hireDate;
    private int hireLevel;
    private int currentLevel;
    public static void main(String[] args) {
        Employee myObj = new Employee();
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        myObj.setFirstName(input.nextLine());
        System.out.println("What is your last name?");
        myObj.setLastName(input.nextLine());
        System.out.println("What is your date of birth?");
        myObj.setDOB(input.nextLine());
        System.out.println("What was your hire date?");
        myObj.setHireDate(input.nextLine());
        System.out.println("What is your ID?");
        myObj.setID(input.nextInt());
        System.out.println("What was your hire level?");
        myObj.setHireLevel(input.nextInt());
        System.out.println("What is your current level?");
        myObj.setCurrentLevel(input.nextInt());
        System.out.println(myObj.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", hireLevel=" + hireLevel +
                ", currentLevel=" + currentLevel +
                '}';
    }
}

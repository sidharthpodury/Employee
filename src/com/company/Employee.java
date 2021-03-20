package com.company;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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
        //Main function

        Company cmpny = new Company();
        try {
        String fileName = "C:\\Users\\sidha\\Downloads\\Company.csv";
        File file = new File(fileName);
        Scanner inputStream = new Scanner(file);
        inputStream.useDelimiter("\r");
        int counter = 0;
        while(inputStream.hasNext()){
            String data = inputStream.next();
            counter++;
            if (counter == 1)
                continue;

            String[] array = data.split(",");
            cmpny.setCompanyID(array[0]);
            cmpny.setCompanyName(array[1]);
            cmpny.setAddress1(array[2]);
            cmpny.setAddress2(array[3]);
            cmpny.setCity(array[4]);
            cmpny.setState(array[5]);
            cmpny.setZipCode(Integer.parseInt(array[6]));
            System.out.println(cmpny.toString());
        }
        inputStream.close();


    }catch (FileNotFoundException e){

        e.printStackTrace();
    }

 /*
        Employee employee = new Employee();
        String fileName = "C:\\Users\\sidha\\Downloads\\Employee.csv";
        File file = new File(fileName);
        try{
            // -read from filePooped with Scanner class
            Scanner inputStream = new Scanner(file);
            // hashNext() loops line-by-line
            int counter = 0;
            while(inputStream.hasNext()){
                String data = inputStream.next();
                counter++;
                if (counter == 1)
                    continue;
                //read single line, put in string

                String[] array = data.split(",");
                employee.setID(Integer.parseInt(array[0]));
                employee.setLastName(array[1]);
                employee.setFirstName(array[2]);
                employee.setDOB(array[3]);
                employee.setHireDate(array[4]);
                employee.setHireLevel(Integer.parseInt(array[5]));
                try {

                    employee.setCurrentLevel(Integer.parseInt(array[6]));
                } catch (NumberFormatException e) {
                    System.out.println(e.toString());
                    employee.setCurrentLevel(-1);
                }
                System.out.println(employee.toString());
            }
            // after loop, close scanner
            inputStream.close();


        }catch (FileNotFoundException e){

            e.printStackTrace();
        }

*/
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

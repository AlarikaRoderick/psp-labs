package com.company.teenager;

import com.company.interfaces.Human;
import com.company.interfaces.Object;

public class Teenager implements Human, Object {
    private String lastName;
    private String firstName;
    private int age;
    private int numbSchool;
    private double averageMark;
    private int birthYear;

    public Teenager() {
        firstName = "Алёна";
        lastName = "Божьякова";
        numbSchool = 1371;
        averageMark = 4.5;
        birthYear = 2001;
        calculateAge(birthYear);
    }

    public Teenager(String firstName, String lastName, int numbSchool, double averageMark, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numbSchool = numbSchool;
        this.averageMark = averageMark;
        calculateAge(birthYear);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumbSchool() {
        return numbSchool;
    }

    public void setNumbSchool(int numbSchool) {
        this.numbSchool = numbSchool;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public void calculateAge(int birthYear) {
        int age = 2018 - birthYear;
        setAge(age);
    }

    @Override
    public void printInfo() {
        System.out.println("================================");
        System.out.println(getLastName() + " " + getFirstName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Номер школы: " + getNumbSchool());
        System.out.println("Средний балл: " + getAverageMark());
    }
}

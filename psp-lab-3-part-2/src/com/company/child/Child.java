package com.company.child;

import com.company.interfaces.Human;
import com.company.interfaces.Object;

public class Child implements Human, Object {
    private String lastName;
    private String firstName;
    private int age;
    private int numbChildGarden;
    private int birthYear;

    public Child(){
        lastName = "Родевич";
        firstName = "Женя";
        birthYear = 2009;
        numbChildGarden = 1250;
        calculateAge(2009);
    }

    public Child(String firstName, String lastName, int numbChildGarden, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numbChildGarden = numbChildGarden;
        this.birthYear = birthYear;
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

    public int getNumbChildGarden() {
        return numbChildGarden;
    }

    public void setNumbChildGarden(int numbChildGarden) {
        this.numbChildGarden = numbChildGarden;
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
        System.out.println("Номер детского сада: " + getNumbChildGarden());
    }
}

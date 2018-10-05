package com.company.parents;

import com.company.interfaces.Human;
import com.company.interfaces.Object;

public abstract class Parent implements Object, Human {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected int numbChild;
    protected String job;
    protected int birthYear;

    public Parent(){}

    public Parent(String firstName, String lastName, int numbChild, String job, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numbChild = numbChild;
        this.job = job;
        this.birthYear = birthYear;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumbChild() {
        return numbChild;
    }

    public void setNumbChild(int numbChild) {
        this.numbChild = numbChild;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public abstract void seeInfo();
}

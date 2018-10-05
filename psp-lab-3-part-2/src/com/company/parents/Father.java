package com.company.parents;

public class Father extends Parent {
    private boolean military;

    public Father(){
        firstName = "Чимин";
        lastName = "Пак";
        numbChild = 0;
        job = "BTS";
        birthYear = 1995;
        military = true;
        calculateAge(birthYear);
    }

    public Father(String firstName, String lastName, int numbChild, String job, int birthYear, boolean military) {
        super(firstName, lastName, numbChild, job, birthYear);
        calculateAge(birthYear);
        this.military = military;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
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
        System.out.println("Количество детей: " + getNumbChild());
        System.out.println("Место работы: " + getJob());
    }

    @Override
    public void seeInfo() {
        System.out.print("Был ли в армии: ");
        if(isMilitary()) System.out.print("Да");
        else System.out.println("Нет");
    }
}

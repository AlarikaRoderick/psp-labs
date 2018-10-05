package com.company.parents;

public class Mother extends Parent {
    private boolean motherChildVacation;

    public Mother(){
        firstName = "Лимочка";
        lastName = "Шабанович";
        numbChild = 0;
        job = "BigHeat";
        birthYear = 1998;
        motherChildVacation = false;
        calculateAge(birthYear);
    }

    public Mother(String firstName, String lastName, int numbChild, String job, int birthYear, boolean motherChildVacation) {
        super(firstName, lastName, numbChild, job, birthYear);
        calculateAge(birthYear);
        this.motherChildVacation = motherChildVacation;
    }

    public boolean isMotherChildVacation() {
        return motherChildVacation;
    }

    public void setMotherChildVacation(boolean motherChildVacation) {
        this.motherChildVacation = motherChildVacation;
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
        seeInfo();
    }

    @Override
    public void seeInfo() {
        System.out.print("Была ли в декрете: ");
        if(isMotherChildVacation()) System.out.println("Да");
        else System.out.println("Нет");
    }
}

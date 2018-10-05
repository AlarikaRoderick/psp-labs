package com.company.model.human;

public class Human {
    protected String firstName;
    protected String lastName;
    protected String patronymic;
    protected String gender;
    protected int age;

    public Human(){
        firstName = "Луи";
        lastName = "Гордиенко";
        patronymic = "Вагонович";
        gender = "мужской";
        age = 20;
    }

    public Human(String firstName, String lastName, String patronymic, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
        this.age = age;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void seeHumanInfo(){
        System.out.println("===================================");
        System.out.println("ФИО: " + lastName + " " + firstName + " " + patronymic);
        System.out.println("Пол: " + gender);
        System.out.println("Возраст: " + age);
    }
}

package com.company.model.teenager;

import com.company.model.human.Human;

public class Teenager extends Human {
    private int numbSchool;
    private double averageMark;

    public Teenager(String firstName, String lastName, String patronymic, String gender, int age, int numbSchool, double averageMark) {
        super(firstName, lastName, patronymic, gender, age);
        this.numbSchool = numbSchool;
        this.averageMark = averageMark;
    }

    public Teenager(){
        super();
        this.numbSchool = 218;
        this.averageMark = 5.0;
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

    @Override
    public void seeHumanInfo() {
        super.seeHumanInfo();
        System.out.println("Номер школы: " + numbSchool);
    }
}

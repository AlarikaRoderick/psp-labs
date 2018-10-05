package com.company.model.parent;

import com.company.model.human.Human;

public class Parent extends Human {
    private int numbChild;
    private String job;

    public Parent(String firstName, String lastName, String patronymic, String gender, int age, int numbChild, String job) {
        super(firstName, lastName, patronymic, gender, age);
        this.numbChild = numbChild;
        this.job = job;
    }

    public Parent(){
        super();
        this.numbChild = 1;
        this.job = "Учитель";
    }

    public int getNumbChilds() {
        return numbChild;
    }

    public void setNumbChilds(int numbChilds) {
        this.numbChild = numbChilds;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void seeHumanInfo() {
        super.seeHumanInfo();
        System.out.println("Количество детей: " + numbChild);
        System.out.println("Место работы: " + job);

    }
}

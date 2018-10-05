package com.company.model.child;

import com.company.model.human.Human;

public class Child extends Human {
    private int numbChildGarden;

    public Child(String firstName, String lastName, String patronymic, String gender, int age, int numbChildGarden){
        super(firstName, lastName, patronymic, gender, age);
        this.numbChildGarden = numbChildGarden;
    }
    public Child(){
        super();
        this.numbChildGarden = 1111;
    }

    public int getNumbChildGarden() {
        return numbChildGarden;
    }

    public void setNumbChildGarden(int numbChildGarden) {
        this.numbChildGarden = numbChildGarden;
    }

    @Override
    public void seeHumanInfo() {
        super.seeHumanInfo();
        System.out.println("Номер детского сада: " + numbChildGarden);
    }
}

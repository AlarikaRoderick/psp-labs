package com.company;

import com.company.child.Child;
import com.company.parents.Father;
import com.company.parents.Mother;
import com.company.teenager.Teenager;

public class Main {
    public static void main(String[] args) {
        Mother firstMother = new Mother("Алиса", "Хотеева", 1,
                "SkyWay", 1999, true);
        Mother secondMother = new Mother();

        Father firstFather = new Father("Антон", "Подрез", 1,
                "SkyWay", 1997, false);
        Father secondFather = new Father();

        Teenager firstTeenager = new Teenager("Арина", "Лешкевич",
                41, 7.8, 2005);
        Teenager secondTeenager = new Teenager();

        Child firstChild = new Child("Олег", "Бересневич",
                235, 2013);
        Child secondChild = new Child();

        firstMother.printInfo();
        secondMother.printInfo();

        firstFather.printInfo();
        firstFather.seeInfo();
        secondFather.printInfo();
        secondFather.seeInfo();

        firstTeenager.printInfo();
        secondTeenager.printInfo();

        firstChild.printInfo();
        secondChild.printInfo();
    }
}

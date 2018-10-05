package com.company;

import com.company.model.child.Child;
import com.company.model.parent.Parent;
import com.company.model.teenager.Teenager;

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child("Валерик", "Коробов", "Антонович", "мужской", 14, 1);
        Child child2 = new Child();

        Teenager teenager1 = new Teenager("Антон", "Подрез", "Александрович", "мужской", 21, 60, 6.7);
        Teenager teenager2 = new Teenager();

        Parent parent1 = new Parent("Алиса", "Хотеева", "Александровна", "женский", 19, 2, "SkyWay");
        Parent parent2 = new Parent();

        child1.seeHumanInfo();
        child2.seeHumanInfo();

        teenager1.seeHumanInfo();
        teenager2.seeHumanInfo();

        parent1.seeHumanInfo();
        parent2.seeHumanInfo();
    }
}

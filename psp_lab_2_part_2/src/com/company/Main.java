package com.company;

public class Main {

    public static void main(String[] args) {
        HorizontalBar horizontalBar = new HorizontalBar();
        Treadmill treadmill = new Treadmill();

        Order order = new Order();

        horizontalBar.setTrainingModel("Высота");
        horizontalBar.setTrainingName("Турник для подтягиваний");
        horizontalBar.setTrainingCost(120);
        horizontalBar.setHumanWeight(100);

        treadmill.setTrainingModel("Скорость");
        treadmill.setTrainingName("Беговая дорожка");
        treadmill.setTrainingCost(200);
        treadmill.setKilometers(100);
        treadmill.setEquipWeight(30);

        order.addTrainingApparatus(horizontalBar);
        order.addTrainingApparatus(treadmill);

        order.printOrder();
        order.countPrice();
        order.printOrder();
    }
}

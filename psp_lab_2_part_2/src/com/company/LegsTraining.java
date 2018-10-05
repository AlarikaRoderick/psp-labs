package com.company;

public class LegsTraining extends TrainingApparatusObject {
    protected int equipWeight;

    public LegsTraining(){
        super();
        equipWeight = 0;
        generateName();
    }

    public int getEquipWeight() {
        return equipWeight;
    }

    public void setEquipWeight(int equipWeight) {
        this.equipWeight = equipWeight;
    }

    @Override
    protected void generateName() {
        trainingName = "Тренажер для тренировки ног";
    }

    @Override
    public String toString() {
        return super.toString() + "Вес для тренажера: " + equipWeight + " кг";
    }
}

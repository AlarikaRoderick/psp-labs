package com.company;

public class ArmsTraining extends TrainingApparatusObject {
    protected int humanWeight;

    public ArmsTraining(){
        super();
        humanWeight = 0;
    }

    public int getHumanWeight() {
        return humanWeight;
    }

    public void setHumanWeight(int humanWeight) {
        this.humanWeight = humanWeight;
    }

    @Override
    protected void generateName() {
        trainingName = "Тренажер для рук";
    }

    @Override
    public String toString() {
        return super.toString() + "Рекомендуемый человеческий вес: " + humanWeight + "\n";
    }
}

package com.company;

abstract public class TrainingApparatusObject implements PriceInterface{
    protected String trainingName;
    protected String trainingModel;
    protected int trainingCost;
    protected int trainingPrice;

    public TrainingApparatusObject() {
        trainingName = "";
        trainingModel = "";
        trainingCost = 0;
        trainingPrice = 0;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public String getTrainingModel() {
        return trainingModel;
    }

    public void setTrainingModel(String trainingModel) {
        this.trainingModel = trainingModel;
    }

    public int getTrainingCost() {
        return trainingCost;
    }

    public void setTrainingCost(int trainingCost) {
        this.trainingCost = trainingCost;
        setTrainingPrice();
    }

    public int getTrainingPrice() {
        return trainingPrice;
    }

    public void setTrainingPrice(int trainingPrice) {
        this.trainingPrice = trainingPrice;
    }

    protected void setTrainingPrice(){
        trainingPrice = countPrice();
    }

    @Override
    public int countPrice() {
        return (int) (trainingCost*1.3);
    }

    @Override
    public String toString() {
        return "Название тренажера: " + trainingName + "\n" + "Название модели: " + trainingModel + "\n"
                + "Цена:" + trainingPrice + "\n";
    }

    abstract protected void generateName();
}

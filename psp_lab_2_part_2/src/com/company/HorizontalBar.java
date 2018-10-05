package com.company;

public class HorizontalBar extends ArmsTraining {
    private int id;
    private static int quantity=0;

    public HorizontalBar() {
        super();
        generateName();
        quantity++;
        id = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        HorizontalBar.quantity = quantity;
    }

    @Override
    protected void generateName() {
        trainingName = "Турник";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof HorizontalBar){
            HorizontalBar temp = (HorizontalBar)obj;
            return this.trainingModel == temp.trainingModel &&
                    this.trainingName == temp.trainingName &&
                    this.trainingCost == temp.trainingCost &&
                    this.id == temp.id &&
                    this.trainingPrice == temp.trainingPrice &&
                    this.humanWeight == temp.humanWeight;
        }
        else return false;
    }

    @Override
    public int hashCode() {
        int hash = 10;
        hash = 20 * hash;
        hash = 20 * hash + id;
        return hash;
    }
}

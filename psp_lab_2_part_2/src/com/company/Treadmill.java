package com.company;

public class Treadmill extends LegsTraining {
    private int kilometers;
    private static int quantity;
    private int id;

    public Treadmill() {
        super();
        generateName();
        kilometers = 0;
        quantity++;
        id = quantity;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Treadmill.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Количество пройденных километров: " + kilometers;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof Treadmill){
            Treadmill temp = (Treadmill) obj;
            return this.trainingModel == temp.trainingModel &&
                    this.trainingName == temp.trainingName &&
                    this.trainingCost == temp.trainingCost &&
                    this.id == temp.id &&
                    this.trainingPrice == temp.trainingPrice &&
                    this.kilometers == temp.kilometers;
        }
        else return false;
    }

    @Override
    public int hashCode() {
        int hash = 15;
        hash = 27 * hash;
        hash = 27 * hash + id;
        return hash;
    }
}

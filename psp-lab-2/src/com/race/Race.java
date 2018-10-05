package com.race;

public class Race {
    private String date;
    private int quantity;
    private boolean havingPrize;

    public Race(String date, int quantity, boolean havingPrize) {
        this.date = date;
        this.quantity = quantity;
        this.havingPrize = havingPrize;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isHavingPrize() {
        return havingPrize;
    }

    public void setHavingPrize(boolean havingPrice) {
        this.havingPrize = havingPrice;
    }

    public void seeInfo(){
        System.out.println("Дата соревнования: " + this.getDate());
        System.out.println("Количество участников: " + this.getQuantity());
        System.out.print("Наличие приза: ");
        if (this.isHavingPrize()) System.out.println("приз был получен");
        else System.out.println("приз не был получен");
    }

    public static int hasPrize(Race[] races){
        int prize = 0;
        for(int i=0; i<races.length; i++){
            if(races[i].havingPrize == true)
                prize++;
        }
        return prize;
    }

    public static int commonQuantityParticipates(Race[] races){
        int quantity = 0;
        for(int i=0; i<races.length; i++){
            quantity+=races[i].quantity;
        }
        return quantity;
    }

    public static void commonInfo(Race[] races){
        System.out.println("Общее количество участников: " + commonQuantityParticipates(races));
        System.out.println("Общее количество соревнований, где был получен приз: " + hasPrize(races));
    }
}

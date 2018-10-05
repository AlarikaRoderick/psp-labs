package com.race;

public class Main {
    public static void main(String[] args) {
        Race []races = new Race[4];
        races[0] = new Race("18.09.2018", 20, true);
        races[1] = new Race("16.09.2018", 10, false);
        races[2] = new Race("01.09.2018", 2, true);
        races[3] = new Race("14.09.2018", 50, true);
        for(int i=0; i<races.length; i++){
            races[i].seeInfo();
        }
        Race.commonInfo(races);
    }
}

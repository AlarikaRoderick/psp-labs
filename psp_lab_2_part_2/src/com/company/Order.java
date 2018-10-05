package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order implements PriceInterface{
    private List<TrainingApparatusObject> trainingApparatusObjectList;
    private int cost;
    private int price;
    private static int orderNum=0;

    public Order()
    {
        trainingApparatusObjectList = new ArrayList<TrainingApparatusObject>();
        orderNum=orderNum+1;
    }

    public void addTrainingApparatus(TrainingApparatusObject obj)
    {
        trainingApparatusObjectList.add(obj);
    }

    public void printOrder()
    {
        int i=1;
        Iterator it=trainingApparatusObjectList.iterator();
        System.out.println("=================================================");
        while(it.hasNext())
        {
            System.out.println(i+")"+(it.next()).toString());
            i=i+1;
        }
        System.out.println();
        System.out.println("Себестоимость заказа: "+cost+" Цена заказа: "+price);
        System.out.println("=================================================");
    }


    @Override
    protected void finalize()
    {
        try {
            super.finalize();
        } catch (Throwable ex) {
            System.err.println("Ошибка при удалении объекта");
        }
        orderNum=orderNum-1;
    }

    @Override
    public int countPrice() {
        int tempPrice=0, tempCost=0;
        Iterator it=trainingApparatusObjectList.iterator();
        TrainingApparatusObject obj;
        while(it.hasNext())
        {
            obj=(TrainingApparatusObject) it.next();
            tempCost=tempCost+obj.getTrainingCost();
            tempPrice=tempPrice+obj.getTrainingPrice();
        }
        cost=tempCost;
        price=tempPrice;
        return tempPrice;
    }

}

package com.example.assignment4;

import java.util.ArrayList;

public class GroceryModel {

    public ArrayList<ChoiceInfo> choiceList;
    private static GroceryModel theModel= null;


    public static class ChoiceInfo {
        public String str;
        public Double price;

        public ChoiceInfo(String str,Double price) {
            this.str = str;
            this.price=price;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

    public static GroceryModel getSingleton() {
        if (theModel == null)
            theModel = new GroceryModel();
        return theModel;
    }

    private GroceryModel() {
        choiceList = new ArrayList<ChoiceInfo>();
        loadChoices();
    }
    private void loadChoices() {

        choiceList.add(new ChoiceInfo("Dozen Eggs",2.50));
        choiceList.add(new ChoiceInfo("Pound Sugar",3.10));
        choiceList.add(new ChoiceInfo("Tea Cake",7.35));

    }

    public void reset(){
        choiceList.clear();
        loadChoices();
    }
    public void add(String s,Double p)
    {

        choiceList.add(new ChoiceInfo(s,p));

    }

}

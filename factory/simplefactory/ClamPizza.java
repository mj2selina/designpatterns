package com.headfirst.designpatterns.factory.simplefactory;

public class ClamPizza extends Pizza{
    public ClamPizza(){
        name = "Clam Pizza";
        dough = "Clam Dough";
        sauce = "Clam Sauce";

        toppings.add("Clam");
    }
}
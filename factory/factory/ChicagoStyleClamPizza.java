package com.headfirst.designpatterns.factory.factory;

public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza(){
        name = "Chicago Style Clam Pizza";
        dough = "Chicago Clam Dough";
        sauce = "Chicago Clam Sauce";

        toppings.add("Chicago Clam");
    }
}
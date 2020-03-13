package com.headfirst.designpatterns.factory.factory;

public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza(){
        name = "NY Style Clam Pizza";
        dough = "NY Clam Dough";
        sauce = "NY Clam Sauce";

        toppings.add("NY Clam");
    }
}
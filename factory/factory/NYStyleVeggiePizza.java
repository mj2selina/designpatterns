package com.headfirst.designpatterns.factory.factory;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza(){
        name = "NY Veggie Pizza";
        dough = "NY Veggie Dough";
        sauce = "NY Veggie Sauce";

        toppings.add("NY Veggie");
    }
}
package com.headfirst.designpatterns.factory.simplefactory;

public class VeggiePizza extends Pizza{
    public VeggiePizza(){
        name = "Veggie Pizza";
        dough = "Veggie Dough";
        sauce = "Veggie Sauce";

        toppings.add("Veggie");
    }
}
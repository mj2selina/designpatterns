package com.headfirst.designpatterns.factory.factory;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza(){
        name = "Chicago Veggie Pizza";
        dough = "Chicago Veggie Dough";
        sauce = "Chicago Veggie Sauce";

        toppings.add("Chicago Veggie");
    }
}
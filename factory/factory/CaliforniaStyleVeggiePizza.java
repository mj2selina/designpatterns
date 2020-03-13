package com.headfirst.designpatterns.factory.factory;

public class CaliforniaStyleVeggiePizza extends Pizza{
    public CaliforniaStyleVeggiePizza(){
        name = "California Veggie Pizza";
        dough = "California Veggie Dough";
        sauce = "California Veggie Sauce";

        toppings.add("California Veggie");
    }
}
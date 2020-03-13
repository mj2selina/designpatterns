package com.headfirst.designpatterns.factory.simplefactory;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza(){
        name = "Pepperoni Pizza";
        dough = "Pepperoni Dough";
        sauce = "Pepperoni Sauce";

        toppings.add("Pepperoni");
    }
}
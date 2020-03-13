package com.headfirst.designpatterns.factory.simplefactory;

public class CheesePizza extends Pizza{
    public CheesePizza(){
        name = "Cheese Pizza";
        dough = "Cheese Dough";
        sauce = "CheeseSauce";

        toppings.add("Cheese Cheese");
    }
}
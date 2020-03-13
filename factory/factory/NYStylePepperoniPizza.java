package com.headfirst.designpatterns.factory.factory;

public class NYStylePepperoniPizza extends Pizza{
    public NYStylePepperoniPizza(){
        name = "NY Style Pepperoni Pizza";
        dough = "NY Pepperoni Dough";
        sauce = "NY Pepperoni Sauce";

        toppings.add("NY Pepperoni");
    }
}
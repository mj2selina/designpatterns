package com.headfirst.designpatterns.factory.factory;

public class CaliforniaStylePepperoniPizza extends Pizza{
    public CaliforniaStylePepperoniPizza(){
        name = "California Style Pepperoni Pizza";
        dough = "California Pepperoni Dough";
        sauce = "California Pepperoni Sauce";

        toppings.add("California Pepperoni");
    }
}
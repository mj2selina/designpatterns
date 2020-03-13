package com.headfirst.designpatterns.factory.factory;

public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Pepperoni Pizza";
        dough = "Chicago Pepperoni Dough";
        sauce = "Chicago Pepperoni Sauce";

        toppings.add("Chicago Pepperoni");
    }
}
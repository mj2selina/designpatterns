package com.headfirst.designpatterns.factory.factory;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "ChicagoStyleCheese Dough";
        sauce = "ChicagoStyleCheese Sauce";

        toppings.add("ChicagoStyleCheese Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
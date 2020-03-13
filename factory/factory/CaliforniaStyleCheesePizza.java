package com.headfirst.designpatterns.factory.factory;

public class CaliforniaStyleCheesePizza extends Pizza{
    public CaliforniaStyleCheesePizza(){
        name = "California Style Deep Dish Cheese Pizza";
        dough = "California Dough";
        sauce = "California Sauce";

        toppings.add("California Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
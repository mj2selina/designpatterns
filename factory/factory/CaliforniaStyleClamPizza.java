package com.headfirst.designpatterns.factory.factory;

public class CaliforniaStyleClamPizza extends Pizza{
    public CaliforniaStyleClamPizza(){
        name = "California Style Clam Pizza";
        dough = "California Clam Dough";
        sauce = "California Clam Sauce";

        toppings.add("California Clam");
    }
}
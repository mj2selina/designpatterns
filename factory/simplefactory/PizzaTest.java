package com.headfirst.designpatterns.factory.simplefactory;

public class PizzaTest{
    public static void main(String[] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + '\n');
        System.out.println(pizza);
    }
}
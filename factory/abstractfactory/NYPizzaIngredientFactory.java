package com.headfirst.designpatterns.factory.abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    //面团
    public Dough createDough(){
        return new ThinCrustDough();
    }
    //酱料
    public Sauce createSauce(){
        return new MarinaraSauce();
    }
    //芝士
    public Cheese createCheese(){
        return new ReggianoCheese();
    }
    //蔬菜
    public Veggies[] createVeggies(){
        Veggies veggies[] = {new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }
    //意式腊肠
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    //蛤蜊
    public Clams createClam(){
        return new FreshClams();
    }
}
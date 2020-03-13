package com.headfirst.designpatterns.factory.abstractfactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    //面团
    public Dough createDough(){
        return new ThickCrustDough();
    }
    //酱料
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }
    //芝士
    public Cheese createCheese(){
        return new MozzarellaCheese();
    }
    //蔬菜
    public Veggies[] createVeggies(){
        Veggies veggies[] = {new Spinach(),new BlackOlives(),new EggPlant()};
        return veggies;
    }
    //意式腊肠
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    //蛤蜊
    public Clams createClam(){
        return new FrozenClams();
    }
}
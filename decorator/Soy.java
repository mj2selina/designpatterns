package com.headfirst.designpatterns.decorator;

public class Soy extends CondimentDecorator{
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public Size getSize(){
        return beverage.getSize();
    }

    public String getDescription(){
        return beverage.getDescription() + ",Soy";
    }
    public double cost(){
        return .15 + beverage.cost();
        /*double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL){
            cost += .10;
        }else if(beverage.getSize() == Size.GRANDE){
            cost += .15;
        }else if(beverage.getSize() == Size.VENTI){
            cost += .20;
        }*/
        //return cost;
    }
}
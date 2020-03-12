//public class Duck{
//    QuackBehavior quackBehavior;
//    public void performQuack(){
//        quackBehavior.quack();
//    }
//}
//package designpatterns.examples.strategy;
package com.headfirst.designpatterns.strategy;
public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swin(){
        System.out.println("All ducks float,even decoys!");
    }
}


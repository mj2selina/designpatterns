//package designpatterns.examples.strategy;
package com.headfirst.designpatterns.strategy;
public class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("<Silence>");
    }
}
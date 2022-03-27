package com.daniel.designpattern.strategy;

import com.daniel.designpattern.strategy.inteface.impl.FlyNoWay;
import com.daniel.designpattern.strategy.inteface.impl.MuteQuack;

/**
 * @author Admin
 * @date 2022/3/26 18:32
 * @description algorithm
 * @className ModelDuck.java
 * @motto Talk is cheap. Show me the code.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}

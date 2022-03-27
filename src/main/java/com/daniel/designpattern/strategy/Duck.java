package com.daniel.designpattern.strategy;

import com.daniel.designpattern.strategy.inteface.FlyBehavior;
import com.daniel.designpattern.strategy.inteface.QuackBehavior;

/**
 * @author Admin
 * @date 2022/3/26 18:24
 * @description algorithm
 * @className Duck.java
 * @motto Talk is cheap. Show me the code.
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * 所有鸭子会游泳
     */
    public abstract void swim();

    /**
     * 所有鸭子有外形
     */
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

}

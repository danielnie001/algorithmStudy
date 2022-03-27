package com.daniel.designpattern.strategy;

import com.daniel.designpattern.strategy.inteface.impl.DuckBuzzer;
import com.daniel.designpattern.strategy.inteface.impl.FlyRocketPowered;

/**
 * @author Admin
 * @date 2022/3/26 18:23
 * @description 设计模式-策略模式
 * @className StrategyPattern.java
 * @motto Talk is cheap. Show me the code.
 */
public class StrategyPattern {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.swim();
        model.display();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.setQuackBehavior(new DuckBuzzer());
        model.performQuack();
    }

}

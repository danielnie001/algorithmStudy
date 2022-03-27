package com.daniel.designpattern.strategy.inteface.impl;

import com.daniel.designpattern.strategy.inteface.FlyBehavior;

/**
 * @author Admin
 * @date 2022/3/26 18:43
 * @description algorithm
 * @className FlyRocketBehavior.java
 * @motto Talk is cheap. Show me the code.
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }

}

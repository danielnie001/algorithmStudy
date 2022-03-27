package com.daniel.designpattern.strategy.inteface.impl;

import com.daniel.designpattern.strategy.inteface.FlyBehavior;

/**
 * @author Admin
 * @date 2022/3/26 18:28
 * @description algorithm
 * @className FlywithWings.java
 * @motto Talk is cheap. Show me the code.
 */
public class FlywithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("鸭子会飞");
    }

}

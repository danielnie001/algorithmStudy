package com.daniel.designpattern.strategy.inteface.impl;

import com.daniel.designpattern.strategy.inteface.FlyBehavior;

/**
 * @author Admin
 * @date 2022/3/26 18:28
 * @description algorithm
 * @className FlyNoWay.java
 * @motto Talk is cheap. Show me the code.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞");
    }

}

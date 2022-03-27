package com.daniel.designpattern.strategy.inteface.impl;

import com.daniel.designpattern.strategy.inteface.QuackBehavior;

/**
 * @author Admin
 * @date 2022/3/26 18:37
 * @description algorithm
 * @className Quack.java
 * @motto Talk is cheap. Show me the code.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I can quack");
    }

}

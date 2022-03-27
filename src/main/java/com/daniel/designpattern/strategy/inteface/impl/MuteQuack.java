package com.daniel.designpattern.strategy.inteface.impl;

import com.daniel.designpattern.strategy.inteface.QuackBehavior;

/**
 * @author Admin
 * @date 2022/3/26 18:38
 * @description algorithm
 * @className MuteQuack.java
 * @motto Talk is cheap. Show me the code.
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I can not quack");
    }

}

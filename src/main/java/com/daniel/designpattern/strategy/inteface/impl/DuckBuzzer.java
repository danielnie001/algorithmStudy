package com.daniel.designpattern.strategy.inteface.impl;

import com.daniel.designpattern.strategy.inteface.QuackBehavior;

/**
 * @author Admin
 * @date 2022/3/26 18:49
 * @description algorithm
 * @className DuckBuzzer.java
 * @motto Talk is cheap. Show me the code.
 */
public class DuckBuzzer implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I'm quack with duck buzzer");
    }

}

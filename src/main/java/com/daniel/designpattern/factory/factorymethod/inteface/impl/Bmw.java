package com.daniel.designpattern.factory.factorymethod.inteface.impl;

import com.daniel.designpattern.factory.factorymethod.inteface.Car;

/**
 * @author Admin
 * @date 2022/3/27 11:29
 * @description algorithm
 * @className Bmw.java
 * @motto Talk is cheap. Show me the code.
 */
public class Bmw implements Car {

    @Override
    public void run() {
        System.out.println("I'm Bmw!");
    }

}

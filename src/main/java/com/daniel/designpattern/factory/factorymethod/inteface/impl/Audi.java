package com.daniel.designpattern.factory.factorymethod.inteface.impl;

import com.daniel.designpattern.factory.factorymethod.inteface.Car;

/**
 * @author Admin
 * @date 2022/3/27 11:30
 * @description algorithm
 * @className Audi.java
 * @motto Talk is cheap. Show me the code.
 */
public class Audi implements Car {

    @Override
    public void run() {
        System.out.println("I'm Audi!");
    }

}

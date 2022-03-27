package com.daniel.designpattern.factory.abstractfactory.inteface.impl;

import com.daniel.designpattern.factory.abstractfactory.inteface.Car;

/**
 * @author Admin
 * @date 2022/3/27 11:40
 * @description algorithm
 * @className CarA.java
 * @motto Talk is cheap. Show me the code.
 */
public class CarB implements Car {

    @Override
    public void run() {
        System.out.println("I'm CarB Run");
    }

}

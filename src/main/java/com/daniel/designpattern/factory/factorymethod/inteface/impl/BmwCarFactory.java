package com.daniel.designpattern.factory.factorymethod.inteface.impl;

import com.daniel.designpattern.factory.factorymethod.inteface.Car;
import com.daniel.designpattern.factory.factorymethod.inteface.CreateFactory;

/**
 * @author Admin
 * @date 2022/3/27 11:32
 * @description algorithm
 * @className BmwCarFactory.java
 * @motto Talk is cheap. Show me the code.
 */
public class BmwCarFactory implements CreateFactory {

    @Override
    public Car createCar() {
        return new Bmw();
    }

}

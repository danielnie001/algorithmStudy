package com.daniel.designpattern.factory.factorymethod.inteface.impl;

import com.daniel.designpattern.factory.factorymethod.inteface.Car;
import com.daniel.designpattern.factory.factorymethod.inteface.CreateFactory;

/**
 * @author Admin
 * @date 2022/3/27 11:31
 * @description algorithm
 * @className AudiCarFactory.java
 * @motto Talk is cheap. Show me the code.
 */
public class AudiCarFactory implements CreateFactory {

    @Override
    public Car createCar() {
        return new Audi();
    }

}

package com.daniel.designpattern.factory.factorymethod;

import com.daniel.designpattern.factory.factorymethod.inteface.Car;
import com.daniel.designpattern.factory.factorymethod.inteface.CreateFactory;
import com.daniel.designpattern.factory.factorymethod.inteface.impl.AudiCarFactory;

/**
 * @author Admin
 * @date 2022/3/27 11:32
 * @description algorithm
 * @className Simulate.java
 * @motto Talk is cheap. Show me the code.
 */
public class Simulate {

    public static void main(String[] args) {
        CreateFactory createFactory = new AudiCarFactory();
        Car car = createFactory.createCar();
        car.run();
    }

}

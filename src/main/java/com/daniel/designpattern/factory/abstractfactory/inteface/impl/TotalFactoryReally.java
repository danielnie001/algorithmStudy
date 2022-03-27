package com.daniel.designpattern.factory.abstractfactory.inteface.impl;

import com.daniel.designpattern.factory.abstractfactory.inteface.Car;
import com.daniel.designpattern.factory.abstractfactory.inteface.Engine;
import com.daniel.designpattern.factory.abstractfactory.inteface.TotalFactory;

/**
 * @author Admin
 * @date 2022/3/27 11:47
 * @description algorithm
 * @className TotalFactoryReally.java
 * @motto Talk is cheap. Show me the code.
 */
public class TotalFactoryReally implements TotalFactory {

    @Override
    public Car createCar() {
        return new CarA();
    }

    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    public static void main(String[] args) {
        TotalFactory totalFactory = new TotalFactoryReally();
        Engine engine = totalFactory.createEngine();
        Car car = totalFactory.createCar();
        engine.run();
        car.run();
    }

}

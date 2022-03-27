package com.daniel.designpattern.factory.simplefactory;

/**
 * @author Admin
 * @date 2022/3/27 11:24
 * @description algorithm
 * @className CarFactory.java
 * @motto Talk is cheap. Show me the code.
 */
public class CarFactory {

    public static Car createCar(String carBrand) {
        Car car = null;
        switch (carBrand) {
            case "Audi":
                car = new Audi();
                break;
            case "Bmw":
                car = new Bmw();
                break;
            default:
                break;
        }
        return car;
    }

    public static void main(String[] args) {
        Car car = CarFactory.createCar("Audi");
        if (car != null) {
            car.run();
        }
    }

}

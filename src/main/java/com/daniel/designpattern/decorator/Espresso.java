package com.daniel.designpattern.decorator;

/**
 * @author Admin
 * @date 2022/3/26 22:39
 * @description algorithm
 * @className Espresso.java
 * @motto Talk is cheap. Show me the code.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}

package com.daniel.designpattern.decorator;

/**
 * @author Admin
 * @date 2022/3/26 22:40
 * @description algorithm
 * @className DarkRoast.java
 * @motto Talk is cheap. Show me the code.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "darkRoast coffee";
    }

    @Override
    public double cost() {
        return .89;
    }

}

package com.daniel.designpattern.decorator;

/**
 * @author Admin
 * @date 2022/3/26 22:44
 * @description algorithm
 * @className Whip.java
 * @motto Talk is cheap. Show me the code.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

}

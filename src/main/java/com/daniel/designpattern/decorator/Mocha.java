package com.daniel.designpattern.decorator;

/**
 * @author Admin
 * @date 2022/3/26 22:42
 * @description algorithm
 * @className Moca.java
 * @motto Talk is cheap. Show me the code.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}

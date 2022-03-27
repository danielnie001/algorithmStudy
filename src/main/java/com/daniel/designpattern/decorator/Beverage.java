package com.daniel.designpattern.decorator;

/**
 * @author Admin
 * @date 2022/3/26 22:35
 * @description 此类为组合类
 * @className Beverage.java
 * @motto Talk is cheap. Show me the code.
 */
public abstract class Beverage {

    public String description = "unknown coffee";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}

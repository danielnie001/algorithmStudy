package com.daniel.designpattern.decorator;

/**
 * @author Admin
 * @date 2022/3/26 22:37
 * @description 此类为装饰者的抽象类
 * @className CondimentDecorator.java
 * @motto Talk is cheap. Show me the code.
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}

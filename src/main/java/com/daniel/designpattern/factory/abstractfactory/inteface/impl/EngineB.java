package com.daniel.designpattern.factory.abstractfactory.inteface.impl;

import com.daniel.designpattern.factory.abstractfactory.inteface.Engine;

/**
 * @author Admin
 * @date 2022/3/27 11:41
 * @description algorithm
 * @className EngineB.java
 * @motto Talk is cheap. Show me the code.
 */
public class EngineB implements Engine {

    @Override
    public void run() {
        System.out.println("转的快！");
    }

}

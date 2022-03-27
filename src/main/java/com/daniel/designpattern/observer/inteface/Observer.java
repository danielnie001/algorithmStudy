package com.daniel.designpattern.observer.inteface;

/**
 * @author Admin
 * @date 2022/3/26 21:08
 * @description algorithm
 * @className Observer.java
 * @motto Talk is cheap. Show me the code.
 */
public interface Observer {

    void update(float temperature, float humidity, float pressure);

}

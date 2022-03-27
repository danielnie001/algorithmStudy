package com.daniel.designpattern.observer.inteface.impl;

import com.daniel.designpattern.observer.inteface.DisplayElement;
import com.daniel.designpattern.observer.inteface.Observer;
import com.daniel.designpattern.observer.inteface.Subject;

/**
 * @author Admin
 * @date 2022/3/26 21:17
 * @description algorithm
 * @className CurrentConditionsDisplay.java
 * @motto Talk is cheap. Show me the code.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float humidity;
    private float temperature;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject subject) {
        this.weatherData = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}

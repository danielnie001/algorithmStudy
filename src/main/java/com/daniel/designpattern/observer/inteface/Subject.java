package com.daniel.designpattern.observer.inteface;

/**
 * @author Admin
 * @date 2022/3/26 21:02
 * @description algorithm
 * @className Subjecyt.java
 * @motto Talk is cheap. Show me the code.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}

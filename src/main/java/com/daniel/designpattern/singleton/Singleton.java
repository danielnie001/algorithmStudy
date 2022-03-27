package com.daniel.designpattern.singleton;

/**
 * @author Admin
 * @date 2022/3/27 10:52
 * @description 单例模式 饿汉模式，实现简单，线程安全
 * @className Singleton.java
 * @motto Talk is cheap. Show me the code.
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1 == singleton);
    }

}

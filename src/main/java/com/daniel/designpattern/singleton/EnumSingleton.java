package com.daniel.designpattern.singleton;

/**
 * @author Admin
 * @date 2022/3/27 11:07
 * @description 推荐使用，默认线程安全，防止反序列化导致重新创建新的对象，保证只有一个实例
 * @className EnumSingleton.java
 * @motto Talk is cheap. Show me the code.
 */
public class EnumSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.SINGLE;
        singleton.print();
    }

    enum Singleton {
        SINGLE;

        private Singleton() {

        }

        public void print() {
            System.out.println("hello world");
        }
    }

}

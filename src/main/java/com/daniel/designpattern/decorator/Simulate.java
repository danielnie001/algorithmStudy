package com.daniel.designpattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Admin
 * @date 2022/3/26 22:41
 * @description algorithm
 * @className Simulate.java
 * @motto Talk is cheap. Show me the code.
 */
public class Simulate {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", cost: $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + ", cost: $" + beverage1.cost());

        int c;
        try {
            InputStream inputStream =
                    new LowercaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

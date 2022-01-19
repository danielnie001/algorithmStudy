package com.daniel.basic;

import java.util.Vector;

/**
 * @author daniel.nie
 * @date 2022/1/19 19:33
 * @description 生产者--消费者多线程模式
 * @className Concurrent.java
 * @motto Talk is cheap. Show me the code.
 */
public class Concurrent {

    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.start();
        for (int i = 0; i < 10; i++) {
            new Consumer(producer, i).start();
        }
    }

    public static class Producer extends Thread {

        static final int MAXQUEUE = 5;
        private Vector messages = new Vector();

        @Override
        public void run() {
            Thread.currentThread().setName("producer");
            try {
                while (true) {
                    putMessage();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }

        private synchronized void putMessage() throws InterruptedException {
            while (messages.size() == MAXQUEUE) {
                wait();
            }
            messages.addElement(new java.util.Date().toString());
            System.out.println(Thread.currentThread().getName() + ",put message");
            notify();

            //Later, when the necessary event happens, the thread that is running it calls notify() from a block synchronized on the same object.
        }

        // Called by Consumer
        public synchronized String getMessage() throws InterruptedException {
            notify();
            while (messages.size() == 0) {
                wait();
                //By executing wait() from a synchronized block, a thread gives up its hold on the lock and goes to sleep.
            }
            String message = (String) messages.firstElement();
            messages.removeElement(message);
            return message;
        }

    }

    public static class Consumer extends Thread {

        int sn;

        Producer producer;

        Consumer(Producer p, int sn) {
            producer = p;
            this.sn = sn;
        }

        @Override
        public void run() {
            Thread.currentThread().setName("consumer--" + sn);
            try {
                while (true) {
                    String message = producer.getMessage();
                    System.out.println(Thread.currentThread().getName() + ",Got message: " + message);
                    //sleep(200);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

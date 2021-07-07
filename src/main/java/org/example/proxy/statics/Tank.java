package org.example.proxy.statics;

import java.util.Random;

/**
 * @author MortonShaw
 * @date 2021/7/7 17:37
 */
class Tank implements Movable {

    @Override
    public void move() {
        System.out.println("I am moving... ...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LogProxy(new TimeProxy(new Tank())).move();
    }

}

class TimeProxy implements Movable {

    private final Movable movable;

    public TimeProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        long l1 = System.currentTimeMillis();
        movable.move();
        System.out.println(System.currentTimeMillis() - l1);
    }

}

class LogProxy implements Movable {

    private final Movable movable;

    public LogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("start logging......");
        this.movable.move();
        System.out.println("end logging......");
    }

}

interface Movable {

    void move();

}


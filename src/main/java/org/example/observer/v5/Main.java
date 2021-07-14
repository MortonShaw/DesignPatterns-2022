package org.example.observer.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/12 17:43
 */
class Main {

    public static void main(String[] args) {
        new Child().wakeup();
    }

}

class Child {
    private boolean cry = false;
    private final List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeup() {
        cry = true;
        for (Observer observer : observers) {
            observer.actionOnWakeUp();
        }
    }

}

interface Observer {
    void actionOnWakeUp();
}

class Dad implements Observer {

    void feed() {
        System.out.println("dad feeding... ...");
    }

    @Override
    public void actionOnWakeUp() {
        feed();
    }

}

class Mum implements Observer {

    void hug() {
        System.out.println("mun huging... ...");
    }

    @Override
    public void actionOnWakeUp() {
        hug();
    }

}

class Dog implements Observer {

    void wang() {
        System.out.println("dog wanging... ...");
    }

    @Override
    public void actionOnWakeUp() {
        wang();
    }

}

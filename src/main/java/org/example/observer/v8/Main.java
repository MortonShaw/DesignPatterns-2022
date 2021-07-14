package org.example.observer.v8;

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
        observers.add((e) -> {
            System.out.println("ppp");
        });
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeup() {
        cry = true;
        for (Observer observer : observers) {
            WakeupEvent event = new WakeupEvent(System.currentTimeMillis(), "bed", this);
            observer.actionOnWakeUp(event);
        }
    }

}

interface Event<T> {

    T getSource();

}

class WakeupEvent implements Event<Child> {

    long timestamp;
    String location;
    Child source;

    public WakeupEvent(long timestamp, String location, Child source) {
        this.timestamp = timestamp;
        this.location = location;
        this.source = source;
    }

    @Override
    public Child getSource() {
        return null;
    }

}

interface Observer {
    void actionOnWakeUp(WakeupEvent event);
}

class Dad implements Observer {

    void feed() {
        System.out.println("dad feeding... ...");
    }

    @Override
    public void actionOnWakeUp(WakeupEvent event) {
        feed();
    }

}

class Mum implements Observer {

    void hug() {
        System.out.println("mun huging... ...");
    }

    @Override
    public void actionOnWakeUp(WakeupEvent event) {
        hug();
    }

}

class Dog implements Observer {

    void wang() {
        System.out.println("dog wanging... ...");
    }

    @Override
    public void actionOnWakeUp(WakeupEvent event) {
        wang();
    }

}

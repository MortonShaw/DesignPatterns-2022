package org.example.proxy.v08;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @author MortonShaw
 * @date 2021/7/7 19:16
 */
class Tank implements Movable {

    @Override
    public void move() {
        System.out.println("I am moving......");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Movable m = (Movable) Proxy.newProxyInstance(Movable.class.getClassLoader(), new Class[]{Movable.class}, (proxy, method, args1) -> {
            System.out.println("method " + method.getName() + " start......");
            Object invoke = method.invoke(tank, args1);
            System.out.println("method " + method.getName() + " end......");
            return invoke;
        });
        m.move();
    }

}

interface Movable {

    void move();

}

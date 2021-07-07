package org.example.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * @author MortonShaw
 * @date 2021/7/7 21:27
 */
class Main {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Task.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Task o = (Task) enhancer.create();
        o.move();
    }

}

class TimeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass().getSuperclass().getName());
        System.out.println("starting... ...");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("ending... ...");
        return invoke;
    }

}

class Task {

    void move() {
        System.out.println("I am moving... ...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

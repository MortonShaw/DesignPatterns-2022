package org.example.cor.v5;

/**
 * @author MortonShaw
 * @date 2021/7/12 14:36
 */
public class Facade {

    Handler getHandler() {
        ConcreteHandler01 concreteHandler01 = new ConcreteHandler01();
        ConcreteHandler02 concreteHandler02 = new ConcreteHandler02();
        concreteHandler01.setNext(concreteHandler02);
        return concreteHandler01;
    }

}

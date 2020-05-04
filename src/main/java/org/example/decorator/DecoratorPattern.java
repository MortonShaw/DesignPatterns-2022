package org.example.decorator;

import java.io.BufferedReader;

public class DecoratorPattern {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("--------------------------------");
        Component decorator = new ConcreteDecorator(component);
        decorator.operation();
    }

}

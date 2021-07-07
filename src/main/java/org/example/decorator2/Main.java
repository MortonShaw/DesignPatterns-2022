package org.example.decorator2;

/**
 * @author MortonShaw
 * @date 2021/7/7 16:45
 */
public class Main {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decorator = new ConcreteDecorator(component);
        component.operate();
        System.out.println("--------------------------------");
        decorator.operate();
    }

}

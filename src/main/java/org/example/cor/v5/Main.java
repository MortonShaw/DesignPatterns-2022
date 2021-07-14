package org.example.cor.v5;

/**
 * @author MortonShaw
 * @date 2021/7/12 14:38
 */
public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        System.out.println(facade.getClass().getClassLoader());
        facade.getHandler().handle("2");
        Facade facade1 = new Facade();
    }

}

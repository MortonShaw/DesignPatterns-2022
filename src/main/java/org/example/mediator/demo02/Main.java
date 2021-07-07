package org.example.mediator.demo02;

/**
 * @author MortonShaw
 * @date 2021/7/7 15:22
 */
public class Main {

    public static void main(String[] args) {
        IColleague colleague01 = new ConcreteColleague01();
        IColleague colleague02 = new ConcreteColleague02();
        colleague01.send();
        System.out.println("----------------------------");
        colleague02.send();
    }

}

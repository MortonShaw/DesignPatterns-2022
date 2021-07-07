package org.example.mediator.demo01;

/**
 * @author MortonShaw
 * @date 2021/7/7 15:07
 */
public class Main {

    public static void main(String[] args) {
        IMediator mediator = new ConcreteMediator();
        AbstractColleague colleague01 = new ConcreteColleague01();
        AbstractColleague colleague02 = new ConcreteColleague02();
        mediator.register(colleague01);
        mediator.register(colleague02);
        colleague01.send();
        System.out.println("-----------------------------------");
        colleague02.send();
    }

}

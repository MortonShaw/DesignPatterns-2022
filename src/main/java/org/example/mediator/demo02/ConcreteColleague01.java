package org.example.mediator.demo02;

/**
 * @author MortonShaw
 * @date 2021/7/7 15:14
 */
class ConcreteColleague01 implements IColleague {

    ConcreteColleague01() {
        SimpleMediator.getInstance().register(this);
    }

    @Override
    public void recieve() {
        System.out.println("具体同事类01收到请求！");
    }

    @Override
    public void send() {
        System.out.println("具体同事类01发出请求！");
        SimpleMediator.getInstance().relay(this);
    }

}

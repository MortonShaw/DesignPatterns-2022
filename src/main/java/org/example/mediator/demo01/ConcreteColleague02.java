package org.example.mediator.demo01;

/**
 * @author MortonShaw
 * @date 2021/7/7 14:47
 */
class ConcreteColleague02 extends AbstractColleague {

    @Override
    protected void recieve() {
        System.out.println("具体同事类02收到请求！");
    }

    @Override
    protected void send() {
        System.out.println("具体同事类02发出请求！");
        mediator.relay(this);
    }

}

package org.example.mediator.demo01;

/**
 * @author MortonShaw
 * @date 2021/7/7 14:37
 */
abstract class AbstractColleague {

    IMediator mediator;

    void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    abstract void recieve();

    abstract void send();

}

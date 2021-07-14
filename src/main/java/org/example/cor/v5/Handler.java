package org.example.cor.v5;

/**
 * @author MortonShaw
 * @date 2021/7/12 14:30
 */
abstract class Handler {

    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    abstract void handle(String request);

}

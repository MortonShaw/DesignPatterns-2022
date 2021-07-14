package org.example.cor.v5;

/**
 * @author MortonShaw
 * @date 2021/7/12 14:31
 */
public class ConcreteHandler01 extends Handler {

    @Override
    void handle(String request) {
        if ("one".equals(request)) {
            System.out.println("具体处理者01负责处理该请求... ...");
        } else {
            if (getNext() != null) {
                getNext().handle(request);
            } else {
                System.out.println("没有人处理该请求");
            }
        }
    }

}

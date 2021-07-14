package org.example.cor.v5;

/**
 * @author MortonShaw
 * @date 2021/7/12 14:32
 */
public class ConcreteHandler02 extends Handler {

    @Override
    void handle(String request) {
        if ("two".equals(request)) {
            System.out.println("具体处理者02负责处理该请求... ...");
        } else {
            if (getNext() != null) {
                getNext().handle(request);
            } else {
                System.out.println("没有人处理该请求");
            }
        }
    }

}

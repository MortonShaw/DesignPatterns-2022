package org.example.strategy.tank;

/**
 * @author MortonShaw
 * @date 2021/7/5 22:02
 */
public class Context {

    public static void main(String[] args) {
        new Context().go(new FireStrategy() {
            @Override
            public void fire(Tank t) {

            }
        });
    }

    void go(FireStrategy fireStrategy) {
    }

}

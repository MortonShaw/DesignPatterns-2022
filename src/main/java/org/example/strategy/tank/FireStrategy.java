package org.example.strategy.tank;

/**
 * @author MortonShaw
 * @date 2021/7/5 16:46
 */
public interface FireStrategy {

    void fire(Tank t);

    default void fire2(Tank t) {

    }

}

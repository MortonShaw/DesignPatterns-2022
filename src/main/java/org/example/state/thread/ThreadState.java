package org.example.state.thread;

/**
 * @author MortonShaw
 * @date 2021/7/15 11:58
 */
abstract class ThreadState {

    abstract void move(Action action);

    abstract void run();

}

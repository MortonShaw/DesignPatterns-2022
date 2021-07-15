package org.example.state.thread;

/**
 * @author MortonShaw
 * @date 2021/7/15 11:54
 */
class ThreadSelf {

    ThreadState state;

    void move(Action input) {
        state.move(input);
    }

    void run() {
        state.run();
    }

}

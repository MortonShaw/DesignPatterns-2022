package org.example.state.thread;

/**
 * @author MortonShaw
 * @date 2021/7/15 11:59
 */
class NewThreadState extends ThreadState {

    private ThreadSelf t;

    public NewThreadState(ThreadSelf t) {
        this.t = t;
    }

    @Override
    void move(Action action) {
        if ("state".equals(action.msg)) {
            t.state = new RunningState(t);
        }
    }

    @Override
    void run() {

    }

}

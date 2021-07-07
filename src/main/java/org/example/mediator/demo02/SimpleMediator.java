package org.example.mediator.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/7 15:13
 */
class SimpleMediator {

    private final List<IColleague> colleagues = new ArrayList<>();

    private SimpleMediator() {

    }

    private static class Holder {
        private static final SimpleMediator INSTANCE = new SimpleMediator();
    }

    public static SimpleMediator getInstance() {
        return Holder.INSTANCE;
    }

    void register(IColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    void relay(IColleague colleague) {
        for (IColleague c : colleagues) {
            if (!c.equals(colleague)) {
                c.recieve();
            }
        }
    }

}

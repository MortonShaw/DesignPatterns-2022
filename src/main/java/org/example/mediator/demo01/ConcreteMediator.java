package org.example.mediator.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/7 14:41
 */
public class ConcreteMediator implements IMediator {

    @Override
    public void register(AbstractColleague colleague) {
        if (!COLLEAGUES.contains(colleague)) {
            COLLEAGUES.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(AbstractColleague colleague) {
        for (AbstractColleague ac : COLLEAGUES) {
            if (!ac.equals(colleague)) {
                ac.recieve();
            }
        }
    }

}

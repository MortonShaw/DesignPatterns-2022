package org.example.mediator.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/7 14:36
 */
interface IMediator {

    List<AbstractColleague> COLLEAGUES = new ArrayList<>();

    void register(AbstractColleague colleague);

    void relay(AbstractColleague colleague);

}

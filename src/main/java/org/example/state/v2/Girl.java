package org.example.state.v2;

/**
 * @author MortonShaw
 * @date 2021/7/15 11:44
 */
public class Girl {

    String name;

    GirlState state;

    void smile() {
        state.smile();
    }

    void cry() {
        state.cry();
    }

    void say() {
        state.say();
    }

}

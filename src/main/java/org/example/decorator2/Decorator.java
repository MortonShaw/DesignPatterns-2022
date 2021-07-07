package org.example.decorator2;

/**
 * @author MortonShaw
 * @date 2021/7/7 16:40
 */
abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }

}

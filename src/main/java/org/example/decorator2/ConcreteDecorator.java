package org.example.decorator2;

/**
 * @author MortonShaw
 * @date 2021/7/7 16:43
 */
class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        this.function();
    }

    private void function() {
        System.out.println("装饰器方法！");
    }

}

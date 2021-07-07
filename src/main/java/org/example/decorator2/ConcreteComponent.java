package org.example.decorator2;

/**
 * @author MortonShaw
 * @date 2021/7/7 16:39
 */
public class ConcreteComponent implements Component {

    @Override
    public void operate() {
        System.out.println("这是主任务！");
    }

}

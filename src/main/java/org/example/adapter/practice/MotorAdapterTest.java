package org.example.adapter.practice;

public class MotorAdapterTest {

    public static void main(String[] args) {
        Motor motor = new ElectricAdapter();
        motor.drive();
    }

}

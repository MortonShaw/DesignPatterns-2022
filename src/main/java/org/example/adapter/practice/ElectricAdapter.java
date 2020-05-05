package org.example.adapter.practice;

public class ElectricAdapter implements Motor {

    private ElectricMotor motor;

    public ElectricAdapter() {
        this.motor = new ElectricMotor();
    }

    @Override
    public void drive() {
        motor.electricDrive();
    }

}

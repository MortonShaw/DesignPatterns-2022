package org.example.adapter.practice;

public class OpticalAdapter implements Motor {

    private OpticalMotor motor;

    public OpticalAdapter() {
        this.motor = new OpticalMotor();
    }

    @Override
    public void drive() {
        motor.opticalMotor();
    }

}

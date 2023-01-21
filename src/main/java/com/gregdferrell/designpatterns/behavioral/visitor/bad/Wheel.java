package com.gregdferrell.designpatterns.behavioral.visitor.bad;

public class Wheel implements AtvPart {

    @Override
    public double calculateShipping() {
        return 12.00;
    }
}

package com.gregdferrell.designpatterns.behavioral.visitor.bad;

public class Oil implements AtvPart {

    @Override
    public double calculateShipping() {
        return 9.00;
    }
}

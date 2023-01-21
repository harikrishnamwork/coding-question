package com.gregdferrell.designpatterns.structural.decorator;

public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "Simple Sandwich";
    }
}

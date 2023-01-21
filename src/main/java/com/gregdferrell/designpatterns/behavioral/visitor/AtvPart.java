package com.gregdferrell.designpatterns.behavioral.visitor;

public interface AtvPart {

    void accept(AtvPartVisitor visitor);
}

package com.pattern.creational.abstractfactory.example1;

public class BlackMacFactory implements ProductFactory {

    @Override
    public Computer getComputer() {
        return new MacComputer();
    }

    @Override
    public Color getColor() {
        return new BlackColor();
    }

}

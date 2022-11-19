package com.pattern.creational.abstractfactory.example1;

public class WhiteWinFactory implements ProductFactory {

    @Override
    public Computer getComputer() {
        return new WinComputer();
    }

    @Override
    public Color getColor() {
        return new WhiteColor();
    }

}

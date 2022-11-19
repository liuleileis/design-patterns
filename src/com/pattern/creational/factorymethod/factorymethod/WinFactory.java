package com.pattern.creational.factorymethod.factorymethod;

public class WinFactory implements ComputerFactory {

    @Override
    public Computer getComputer() {
        return new WinComputer();
    }

}

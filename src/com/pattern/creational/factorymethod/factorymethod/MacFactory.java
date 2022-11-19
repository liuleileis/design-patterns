package com.pattern.creational.factorymethod.factorymethod;

public class MacFactory implements ComputerFactory {

    @Override
    public Computer getComputer() {
        return new MacComputer();
    }

}

package com.pattern.creational.factorymethod.staticfactorymethod;

public class ComputerFactory {

    public static Computer getComputer (String computerName) {
        if ("win".equals(computerName)) {
            return new WinComputer();
        } else if ("mac".equals(computerName)) {
            return new MacComputer();
        }
        return null;
    }

}

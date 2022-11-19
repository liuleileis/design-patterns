package com.pattern.creational.factorymethod.factorymethod;

public class Test {

    public static void main(String[] args) {
        // get win computer
        ComputerFactory winFactory = new WinFactory();
        Computer winComputer = winFactory.getComputer();
        System.out.println(winComputer.getComputerName());

        // get mac computer
        ComputerFactory macFactory = new MacFactory();
        Computer macComputer = macFactory.getComputer();
        System.out.println(macComputer.getComputerName());
    }

}

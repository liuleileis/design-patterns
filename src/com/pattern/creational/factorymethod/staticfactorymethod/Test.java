package com.pattern.creational.factorymethod.staticfactorymethod;

public class Test {

    public static void main(String[] args) {
        // get win computer
        Computer winComputer = ComputerFactory.getComputer("win");
        System.out.println(winComputer.getComputerName());

        // get mac computer
        Computer macComputer = ComputerFactory.getComputer("mac");
        System.out.println(macComputer.getComputerName());
    }

}

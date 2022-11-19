package com.pattern.creational.abstractfactory.example1;

public class Test {

    public static void main(String[] args) {
        // Black Mac Computer Factory
        ProductFactory colorComputer1 = new BlackMacFactory();
        System.out.println(colorComputer1.getColor().getColorName());
        System.out.println(colorComputer1.getComputer().getComputerName());

        // White Win Computer Factory
        ProductFactory colorComputer2 = new WhiteWinFactory();
        System.out.println(colorComputer2.getColor().getColorName());
        System.out.println(colorComputer2.getComputer().getComputerName());
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27 inch Beast", "acer", 27, new Resolution(2540, 1440));

        MatherBoard matherBoard = new MatherBoard("BJ-200", "asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, matherBoard);
        thePC.powerUp();
    }
}

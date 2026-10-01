package com.product.light.switches;

public class Syska implements Switches {
    @Override
    public void on() {
        System.out.println("Syska bulb get turned on");

    }

    @Override
    public void off() {
        System.out.println("Syska bulb turned off");

    }
}

package com.product.light.switches;

public class Surya implements Switches {
    @Override
    public void on() {
        System.out.println("Surya bulb turned on");
    }

    @Override
    public void off() {
        System.out.println("Surya bulb turned off");

    }
}

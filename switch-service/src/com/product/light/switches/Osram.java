package com.product.light.switches;

public class Osram implements Switches {
    @Override
    public void on() {
        System.out.println("Osram bulb turned on");
    }

    @Override
    public void off() {
        System.out.println("Osram bulb turned off");

    }
}

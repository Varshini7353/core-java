package com.product.light.switches;

public class Bajaj implements Switches {
    @Override
    public void on() {
        System.out.println("Bajaj bulb turned on");
    }

    @Override
    public void off() {
        System.out.println("Bajaj bulb turned off");

    }
}

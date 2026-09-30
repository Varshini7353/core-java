package com.product.light.switches;

public class Havells implements Switches {
    @Override
    public void on() {
        System.out.println("Havells bulb turned on");
    }

    @Override
    public void off() {
        System.out.println("Havells bulb turned off");

    }
}

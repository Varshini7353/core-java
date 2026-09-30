package com.product.light.switches;

public class Orient implements Switches {
    @Override
    public void on() {
        System.out.println("Orient bulb turned on");
    }

    @Override
    public void off() {
        System.out.println("Orient bulb turned off");

    }
}

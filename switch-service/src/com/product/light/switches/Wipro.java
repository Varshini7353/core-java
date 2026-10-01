package com.product.light.switches;

public class Wipro implements Switches {
    @Override
    public void on() {
        System.out.println("wipro bulb turned on");
    }

    @Override
    public void off() {
        System.out.println("wipro bulb turned off");

    }
}

package com.product.light.switches;

public class Crompton implements Switches {
    @Override
    public void on() {
        System.out.println("Crompton bulb turned on");
    }

    @Override
    public void off() {
        System.out.println("Crompton bulb turned off");

    }
}

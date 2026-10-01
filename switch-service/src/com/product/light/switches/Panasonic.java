package com.product.light.switches;

public class Panasonic implements Switches {
    @Override
    public void on() {
        System.out.println("Panasonic bulb turned on");
    }

    @Override
    public void off() {
        System.out.println("Panasonic bulb turned off");

    }
}

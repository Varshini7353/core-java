package com.system.infra.app;

public class Component {

    public Component(){
        System.out.println("component cons invoked");
    }

    public Component(int i){
        System.out.println("component cons invoked with int param");
    }

    public void getComponentDetails(){
        System.out.println("componentDetails cons invoked");
    }
}

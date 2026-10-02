package com.system.infra;


import com.system.infra.app.Component;
import com.system.infra.app.cloud.MicroService;

public class SystemRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

        Component com=new MicroService();//upcasting
        Component com1=new MicroService(8);
        com. getComponentDetails();



        MicroService service=(MicroService)com;
        service.getMicroServiceDetails();
        service.getComponentDetails();
        
        

        System.out.println("Main ended");
    }
}

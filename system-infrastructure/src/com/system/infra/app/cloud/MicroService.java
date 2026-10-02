package com.system.infra.app.cloud;

import com.system.infra.app.Component;

public class MicroService extends Component {

    public MicroService(){
        super();
        System.out.println("microservice cons invoked");
    }

    public MicroService(int i) {
        super(i);
        System.out.println("Microservice cons invoked with int param");
    }

        public void getMicroServiceDetails(){
            System.out.println("get the details of microservice");
    }


}

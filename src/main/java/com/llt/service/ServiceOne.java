package com.llt.service;

public class ServiceOne {

    private ServiceTwo serviceTwo;
    private ServiceThree serviceThree;

    public ServiceOne(ServiceTwo serviceTwo, ServiceThree serviceThree) {
        this.serviceThree = serviceThree;
        this.serviceTwo = serviceTwo;
    }

    public ServiceTwo getServiceTwo() {
        return serviceTwo;
    }

    public ServiceThree getServiceThree() {
        return serviceThree;
    }
}

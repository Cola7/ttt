package com.cola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controllertest {

    public Servicetest getServicetest() {
        return servicetest;
    }

    public void setServicetest(Servicetest servicetest) {
        this.servicetest = servicetest;
    }

    @Autowired
    private  Servicetest servicetest;

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Servicetest servicetest = (Servicetest) ac.getBean("servicetest");

        Controllertest controllertest = (Controllertest)ac.getBean("controllertest");
//        Controllertest controllertest = new Controllertest();

        controllertest.servicetest.ss();


    }
}

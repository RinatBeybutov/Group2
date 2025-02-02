package org.example;

import org.example.proxy.Service;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

@Component
//@Order
public class GreenCat implements Cat, DisposableBean {

    private String name = "GreenCat";

    @Autowired
    private List<Service> services;

    @Autowired
    private Map<String, Service> serviceMap;

    @Override
    public void destroy() throws Exception {
        System.out.println( "destroy");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }
}

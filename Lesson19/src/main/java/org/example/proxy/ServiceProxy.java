package org.example.proxy;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ServiceProxy implements Service {

    private ServiceImpl service;

    public void setService(ServiceImpl service) {
        this.service = service;
    }

    @Override
    public void print() {
        service.print();
    }
}

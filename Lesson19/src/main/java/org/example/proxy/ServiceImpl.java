package org.example.proxy;

import org.example.GreenCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Order(2)
public class ServiceImpl implements Service {

    @Autowired
    private GreenCat cat;

    @Override
    public void print() {
        System.out.println("hello");
    }
}

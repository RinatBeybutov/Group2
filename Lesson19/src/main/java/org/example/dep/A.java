package org.example.dep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    private B circB;

    /*@Autowired
    public A(B circB) {
        this.circB = circB;
    }*/

    @Autowired
    public void setB(B b) {
        this.circB = b;
    }
}

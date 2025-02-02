package org.example.dep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    private A circA;

    /*@Autowired
    public B(A circA) {
        this.circA = circA;
    }*/

    @Autowired
    public void setA(A a) {
        this.circA = a;
    }
}

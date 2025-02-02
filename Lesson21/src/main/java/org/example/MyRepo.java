package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile(value = "test")
public class MyRepo {

    //@Value("${name}")
    private String name = "test";

    public void setName(String name) {
        this.name = name;
    }
}

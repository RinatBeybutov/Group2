package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "test")
public class MyService {

    //@Autowired
    private final MyRepo myRepo;

    public MyService(MyRepo myRepo) {
        this.myRepo = myRepo;
    }
}

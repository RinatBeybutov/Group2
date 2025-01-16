package org.example;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

//@Data
//@RequiredArgsConstructor
@Builder
public class Cat {

    private String name;
    private int age;
    private String color;
}

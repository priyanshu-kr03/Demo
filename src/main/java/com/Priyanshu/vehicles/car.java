package com.Priyanshu.vehicles;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class car implements Vehicle {

    @Override
    public void show() {
        System.out.println("Calling from Car");
    }
}
package com.Priyanshu.Testing;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class Truck implements Vehicle{
    @Override
    public void show() {
        System.out.println("Calling from truck");
    }
}

package com.Priyanshu.testApp;

import com.Priyanshu.vehicles.Vehicle;
import com.Priyanshu.factory.VehicleFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestApp {
    @Autowired
    public VehicleFactory vehicleFactory;

    public void testApp(){
        List<Vehicle> vehicleList = vehicleFactory.getVehicles();
        for(Vehicle c: vehicleList) {
            c.show();
        }
        System.out.println("Himanshu");
    }
}

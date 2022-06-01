package com.Priyanshu.testApp;

import com.Priyanshu.Testing.Vehicle;
import com.Priyanshu.demo.GetCommand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestApp {
    @Autowired
    public GetCommand getCommand;

    public void testApp(){
        List<Vehicle> vehicleList = getCommand.get("y");
        for(Vehicle c: vehicleList){
            c.show();
        }
        System.out.println("Himanshu");
    }
}

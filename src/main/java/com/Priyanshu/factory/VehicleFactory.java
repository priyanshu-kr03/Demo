package com.Priyanshu.factory;

import com.Priyanshu.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@NoArgsConstructor
public class VehicleFactory {

    @Autowired
    private List<Vehicle> vehicleList;

    public VehicleFactory(List<Vehicle> vehicleList){
        this.vehicleList = vehicleList;
    }

    public List getVehicles() {
        return vehicleList;
    }
}

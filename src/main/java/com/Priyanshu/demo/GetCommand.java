package com.Priyanshu.demo;

import com.Priyanshu.Testing.Vehicle;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

//@NoArgsConstructor
@Component
//@NoArgsConstructor
public class GetCommand {

    @Autowired
    private List<Vehicle> vehicleList;
    public GetCommand(List<Vehicle> vehicleList){
        this.vehicleList = vehicleList;
    }

    protected List get(String s) {
        return vehicleList;
    }
}

package com.Priyanshu;

import com.Priyanshu.Testing.Vehicle;
import com.Priyanshu.demo.GetCommand;
import com.Priyanshu.testApp.TestApp;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class DemoApplication {


	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		GetCommand command = GetCommand.class;
		List<Vehicle> vehicleList =

		for(Vehicle c: vehicleList)
		{
			c.show();
		}
//		System.out.println(vehicleList);
	}

}

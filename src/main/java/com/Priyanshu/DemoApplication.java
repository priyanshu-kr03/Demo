package com.Priyanshu;

import com.Priyanshu.testApp.TestApp;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class DemoApplication {


	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		TestApp testApp = new TestApp();
		testApp.testApp();
	}

}

package com.fl.myopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyopenshiftApplication {

	@GetMapping("/")
	public String getMessage(){
		return "welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyopenshiftApplication.class, args);
	}

}

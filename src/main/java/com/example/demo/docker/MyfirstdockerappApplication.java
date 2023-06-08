package com.example.demo.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyfirstdockerappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstdockerappApplication.class, args);
	}

	@GetMapping("/msg")
	public String getMsg() {
		return "welcome Qoyum Yusuf on this very nice app :)";
	}

	@GetMapping("/msg2")
	public String getMsg2() {
		return "this is msg 2 for docker and hello...";
	}
	
	
	

}

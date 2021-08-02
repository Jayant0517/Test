package com.ex.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class ActuatorController {

	@GetMapping("/getInfo")
	public String getInfo() {
		return "Spring Boot Actuator...";
	}

		public String getStatus() {
		return "Spring Boot Actuator...";
	}

}

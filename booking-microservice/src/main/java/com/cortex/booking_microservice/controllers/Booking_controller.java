package com.cortex.booking_microservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/booking")
public class Booking_controller {
	@GetMapping("/mm")
	public String ma2() {
		return "SERVICIO ACTIVO";
	}
}

package com.greenface.microservice.limitservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenface.microservice.limitservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@GetMapping("/limit")
	public LimitConfiguration retrieveLimits() {
		return new LimitConfiguration(1,1000);
	}
	
}

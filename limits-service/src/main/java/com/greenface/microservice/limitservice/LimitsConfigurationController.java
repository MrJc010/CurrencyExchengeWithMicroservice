package com.greenface.microservice.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenface.microservice.limitservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	
	@Autowired
	Configuration config;
	
	@GetMapping("/limit")
	public LimitConfiguration retrieveLimits() {
		return new LimitConfiguration(config.getMinimum(), config.getMaximum());
	}
	
}

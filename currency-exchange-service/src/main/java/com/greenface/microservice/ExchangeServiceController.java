package com.greenface.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeServiceController {
	
	@Autowired
	private ExchangeValueRepository exchangeRepo;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/getchange/{from}-{to}")
	public ExchangeValue exchange(@PathVariable String from,@PathVariable String to) {
		ExchangeValue exchange = exchangeRepo.findByFromAndTo(from.toUpperCase(),to.toUpperCase());
		exchange.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchange;
	}

}

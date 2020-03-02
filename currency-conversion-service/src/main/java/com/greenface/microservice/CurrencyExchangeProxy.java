package com.greenface.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange-service",url="http://localhost:8000")
public interface CurrencyExchangeProxy {
	@GetMapping("/getchange/{from}-{to}")
	public CurrencyConversion exchange(@PathVariable String from,@PathVariable String to);
}

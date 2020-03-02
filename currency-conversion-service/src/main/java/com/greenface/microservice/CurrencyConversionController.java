package com.greenface.microservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
public class CurrencyConversionController {
	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("/convert/{from}-{to}/quantity-{quantity}")
	public CurrencyConversion getconvert(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		CurrencyConversion response = proxy.exchange(from, to);
		return new CurrencyConversion(response.getId(), from, to, quantity, response.getConversionUnit(), quantity.multiply(response.getConversionUnit()), response.getPort());
	}
}

package com.greenface.microservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private BigDecimal conversionUnit;
	private int port;
	
	
	
	public ExchangeValue() {
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionUnit) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionUnit = conversionUnit;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionUnit() {
		return conversionUnit;
	}
	public void setConversionUnit(BigDecimal conversionUnit) {
		this.conversionUnit = conversionUnit;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "ExchangeService [Id=" + id + ", from=" + from + ", to=" + to + ", conversionUnit=" + conversionUnit
				+ ", port=" + port + "]";
	}
	
	

}

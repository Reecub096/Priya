package com.cg.sts.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_master")
public class Stock {
	
	@Id
	@Column(name = "stock_code")
	Integer code;
	
	@Column(name = "stock")
	String stock_name;
	
	@Column(name = "quote")
	Float quote;
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public Float getQuote() {
		return quote;
	}

	public void setQuote(Float quote) {
		this.quote = quote;
	}

	public Stock(Integer code, String stock_name, Float quote) {
		super();
		this.code = code;
		this.stock_name = stock_name;
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "Stock [code=" + code + ", stock_name=" + stock_name + ", quote=" + quote + "]";
	}
	
	
}

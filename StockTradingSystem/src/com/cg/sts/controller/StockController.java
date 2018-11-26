package com.cg.sts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.sts.dto.Stock;
import com.cg.sts.service.StockService;

@Controller
public class StockController {
	
	@Autowired
	StockService stockservice;
	
	@RequestMapping("index")
	public ModelAndView getStockDetails(@ModelAttribute("my") Stock s)
	{
		
		List<Stock> stockList = stockservice.getStockDetails();
		for (Stock stock : stockList)
			System.out.println(stock);
		return new ModelAndView("index" , "shares", stockList);
	}
}

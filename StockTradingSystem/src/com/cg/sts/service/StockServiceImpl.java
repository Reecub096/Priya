package com.cg.sts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sts.dao.StockDAO;
import com.cg.sts.dto.Stock;

@Service("stockservice")
@Transactional
public class StockServiceImpl implements StockService{
	
	@Autowired
	StockDAO stockdao;

	@Override
	public List<Stock> getStockDetails() {
		// TODO Auto-generated method stub
		return stockdao.getStockDetails();
	}

}

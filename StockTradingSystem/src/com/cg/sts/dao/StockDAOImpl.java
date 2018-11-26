package com.cg.sts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.sts.dto.Stock;

@Repository("stockdao")
public class StockDAOImpl implements StockDAO{
	
	@PersistenceContext
	EntityManager manager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Stock> getStockDetails() {
		// TODO Auto-generated method stub
		Query query = manager.createQuery("FROM Stock");
		List<Stock> queryList = query.getResultList();
		return queryList;
	}

}

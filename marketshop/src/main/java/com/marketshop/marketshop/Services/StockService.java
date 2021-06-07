package com.marketshop.marketshop.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketshop.marketshop.DAO.StockDAO;
import com.marketshop.marketshop.Entities.Stock;



@Service
public class StockService {
	@Autowired
	private StockDAO stockDao;

	public List<Stock> listAll() {
		return stockDao.findAll();
	}

	public void save(Stock stock) {
		stockDao.save(stock);
	}

	public Stock get(long id) {
		return stockDao.findById(id).get();
	}

	public void delete(long id) {
		stockDao.deleteById(id);
	}
	
	/*public void saveCustomerStock(Stock stock) {
		stockDao.save(stock);
	}*/

}

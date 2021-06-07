package com.marketshop.marketshop.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketshop.marketshop.DAO.BillingDAO;
import com.marketshop.marketshop.DAO.StockDAO;
import com.marketshop.marketshop.Entities.Billing;
import com.marketshop.marketshop.Entities.Stock;

@Service
public class BillingService {

	@Autowired
	private BillingDAO billingDao;

	public List<Billing> listAll() {
		return billingDao.findAll();

	}

	public void save(Billing billing) {
		billingDao.save(billing);
	}

	public Billing get(long id) {
		return billingDao.findById(id).get();
	}

	public void delete(long id) {
		billingDao.deleteById(id);
	}

	/*public void saveCustomer(Billing billing) {
		billingDao.save(billing);
	}*/

}

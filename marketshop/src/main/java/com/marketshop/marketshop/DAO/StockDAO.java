package com.marketshop.marketshop.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.marketshop.marketshop.Entities.Stock;

@Repository
public interface StockDAO extends JpaRepository<Stock, Long> {

}

package com.marketshop.marketshop.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marketshop.marketshop.Entities.Billing;

@Repository
public interface BillingDAO extends JpaRepository<Billing, Long>{

}

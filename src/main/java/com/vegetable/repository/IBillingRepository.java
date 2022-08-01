package com.vegetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vegetable.model.BillingDetails;

@Repository
public interface IBillingRepository extends JpaRepository<BillingDetails, Integer>{

	
}

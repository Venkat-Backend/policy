package com.policy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.policy.model.QuotationCustomer;

public interface QuotationCustomerRepository extends JpaRepository<QuotationCustomer, Long> {

List<QuotationCustomer> findByFirstNameContainingIgnoreCaseAndOrganizationId(String firstName,long organizationId);
	
	Optional<QuotationCustomer> findByEmail(String email);
	
	List<QuotationCustomer> findByOrganizationId(long organizationId);
}

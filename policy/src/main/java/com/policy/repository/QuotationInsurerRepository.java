package com.policy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.policy.model.QuotationInsurer;

public interface QuotationInsurerRepository extends JpaRepository<QuotationInsurer, Long>{
	
	List<QuotationInsurer> findByFirstNameContainingIgnoreCaseAndOrganizationId(String firstName,long organizationId);
	
	Optional<QuotationInsurer> findByEmail(String email);

	List<QuotationInsurer> findQuotationInsurerByOrganizationId(long organizationId);

}

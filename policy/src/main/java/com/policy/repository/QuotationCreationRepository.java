package com.policy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.policy.model.QuotationCreation;

public interface QuotationCreationRepository extends JpaRepository<QuotationCreation, Long> {

	List<QuotationCreation> findByOrganizationId(long organizationId);

	List<QuotationCreation> findByOrganizationIdAndStatus(long organizationId, int status);

}

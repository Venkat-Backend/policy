package com.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.policy.model.QuotationPlan;

public interface QuotationPlanRepository extends JpaRepository<QuotationPlan, Long> {

}

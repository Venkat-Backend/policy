package com.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.policy.model.QuotationDiscount;

public interface QuotationDiscountRepository extends JpaRepository<QuotationDiscount, Long> {

}

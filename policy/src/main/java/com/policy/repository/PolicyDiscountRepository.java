package com.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policy.model.PolicyDiscounts;

@Repository
public interface PolicyDiscountRepository extends JpaRepository<PolicyDiscounts, Long>{

}

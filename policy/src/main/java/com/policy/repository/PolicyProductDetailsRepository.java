package com.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policy.model.PolicyProductDetails;

@Repository
public interface PolicyProductDetailsRepository extends JpaRepository<PolicyProductDetails, Long>{

}

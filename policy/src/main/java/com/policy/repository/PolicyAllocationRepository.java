package com.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policy.model.PolicyAllocationDetails;

@Repository
public interface PolicyAllocationRepository extends JpaRepository<PolicyAllocationDetails, Long>{

}

package com.policy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policy.model.PolicyTreatyAllocation;

@Repository
public interface PolicyTreatyAllocationDetailsRepository extends JpaRepository<PolicyTreatyAllocation, Long>{


}

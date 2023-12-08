package com.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policy.model.PolicyPlan;

@Repository
public interface PolicyPlanRepository extends JpaRepository<PolicyPlan, Long>{

}

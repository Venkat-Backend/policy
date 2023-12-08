package com.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policy.model.PolicyAddOnCovers;

@Repository
public interface PolicyAddOnCoversRepository extends JpaRepository<PolicyAddOnCovers, Long>{

}

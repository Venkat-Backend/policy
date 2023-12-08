package com.policy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policy.model.PolicyCreation;

@Repository
public interface PolicyCreationRepository extends JpaRepository<PolicyCreation, Long>{

	List<PolicyCreation> findByOrganizationId(long organizationId);

	List<PolicyCreation> findByOrganizationIdAndStatus(long organizationId, int status);

}

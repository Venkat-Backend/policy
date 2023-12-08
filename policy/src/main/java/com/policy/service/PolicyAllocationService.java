package com.policy.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policy.model.PolicyAllocationDetails;
import com.policy.model.PolicyRiskDetails;
import com.policy.model.PolicyTreatyAllocation;
import com.policy.repository.PolicyAllocationRepository;
import com.policy.repository.PolicyRiskDetailsRepository;
import com.policy.repository.PolicyTreatyAllocationDetailsRepository;
import com.policy.util.ResponseInfo;

@Service
public class PolicyAllocationService {
	
	@Autowired
	private PolicyAllocationRepository allocationRepository;
	
	@Autowired
	private PolicyRiskDetailsRepository riskDetailsRepository;
	
	@Autowired
	private PolicyTreatyAllocationDetailsRepository policyTreatyAllocationDetailsRepository;
	
//	@Autowired
//	private PolicyAllocationTotalRepository allocationTotalRepository;
	
	public Map<String, Object> savePolicyConversion(PolicyAllocationDetails allocationDetails) {
		Map<String, Object> out = new LinkedHashMap<>();
		 allocationRepository.save(allocationDetails);
		out.put("message", "Policy Allocation Details Saved Successfully");
		return out;
	}
	
//	@Transactional
//	public List<PolicyRiskDetails> savePolicyRiskDetailslist(List<PolicyRiskDetails> policyRiskDetails){
//		List<PolicyRiskDetails> response = (List<PolicyRiskDetails>)riskDetailsRepository.saveAll(policyRiskDetails);
//		return response;
//	}
//	
//	@Transactional
//	public List<PolicyTreatyAllocation> savePolicyTreatyDetailsList(List<PolicyTreatyAllocation> policyTreatyAllocations){
//		List<PolicyTreatyAllocation> response = (List<PolicyTreatyAllocation>)policyTreatyAllocationDetailsRepository.saveAll(policyTreatyAllocations);
//		return response;
//	}
}

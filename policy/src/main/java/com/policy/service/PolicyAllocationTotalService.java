//package com.policy.service;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.policy.model.PolicyAllocationTotal;
//import com.policy.repository.PolicyAllocationTotalRepository;
//
//@Service
//public class PolicyAllocationTotalService {
//
//	@Autowired
//	private PolicyAllocationTotalRepository allocationTotalRepository;
//	
//	public Map<String, Object> savePolicyAllocationTotal(PolicyAllocationTotal allocationTotal) {
//		Map<String, Object> out = new LinkedHashMap<>();
//		allocationTotalRepository.save(allocationTotal);
//		out.put("message", "Policy Allocation Total Saved Successfully");
//		return out;
//	}
//}

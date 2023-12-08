package com.policy.controller;

import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.policy.model.PolicyAllocationDetails;
import com.policy.model.PolicyRiskDetails;
import com.policy.model.PolicyTreatyAllocation;
import com.policy.service.PolicyAllocationService;
import com.policy.util.ResponseInfo;
import com.policy.util.ResponseInfo.ResponseType;

@RestController
public class PolicyAllocationController {
	
	@Autowired
	private PolicyAllocationService allocationService;
	ModelMapper mapper = new ModelMapper();
	ResponseEntity<Object> response = null;
	
	@PostMapping("/policy/policyconversionbasicdetails")
	public ResponseEntity<Object> savePolicyConversionDetails(@RequestBody PolicyAllocationDetails allocationDetails){
		PolicyAllocationDetails policyAllocationDetails = mapper.map(allocationDetails, PolicyAllocationDetails.class);
		
		Map<String, Object> out = allocationService.savePolicyConversion(policyAllocationDetails);
		response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS,out),HttpStatus.OK);
		
		return response;
	}
	
//	@PostMapping("/policy/policyriskgroupdetailslist")
//	public List<PolicyRiskDetails> savePolicyRiskGroupDetailsList(@RequestBody List<PolicyRiskDetails> policyRiskDetails){
//		List<PolicyRiskDetails> response = (List<PolicyRiskDetails>)allocationService.savePolicyRiskDetailslist(policyRiskDetails);
//		return response;
//	}
//	
//	@PostMapping("/policy/policytreatyallocationdetails")
//	public List<PolicyTreatyAllocation> savePolicyTreatyAllocationDetails(@RequestBody List<PolicyTreatyAllocation> policyTreatyAllocations){
//		List<PolicyTreatyAllocation> response = (List<PolicyTreatyAllocation>)allocationService.savePolicyTreatyDetailsList(policyTreatyAllocations);
//		return response;
//	}
}


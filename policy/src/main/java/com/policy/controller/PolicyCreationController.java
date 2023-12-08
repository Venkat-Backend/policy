package com.policy.controller;

import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.policy.model.PolicyCreation;
import com.policy.service.PolicyCreationService;
import com.policy.util.ResponseInfo;
import com.policy.util.ResponseInfo.ResponseType;

@RestController
public class PolicyCreationController {

	@Autowired
	private PolicyCreationService policyService;
	ModelMapper mapper = new ModelMapper();
	ResponseEntity<Object> response = null;

	@PostMapping("/policy/savepolicydetails")
	public ResponseEntity<Object> savePolicyCreation(@RequestBody PolicyCreation input) {
		PolicyCreation policy = mapper.map(input, PolicyCreation.class);

		Map<String, Object> out = policyService.savePolicyCreation(policy);
		 response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);
		    return response;
	}
	
	
	@GetMapping("/policy/getallpolicydetails")
	public List<PolicyCreation> findAllPolicyCreation(){
		return policyService.findAllPolicyCreation();
	}
	
	@GetMapping("/policy/getpolicydetailsbyid/{policyId}")
	public PolicyCreation getCustomerById(@PathVariable long policyId) {
		return policyService.findPolicyCreationByPolicyId(policyId);
	}
	
	@GetMapping("/policy/getpolicydetailsbyOrganizationId/{organizationId}")
	public List<PolicyCreation> getpolicydetailsbyOrganizationId(@PathVariable long organizationId) {
		return policyService.getpolicydetailsbyOrganizationId(organizationId);
	}
	
	@GetMapping("/policy/getpolicydetailsByOrganizationIdAndStatus/{organizationId}/{status}")
	public List<Map<String, Object>> getdetailsbyOrganizationIdAndStatus(@PathVariable long organizationId, @PathVariable int status) {
		return policyService.getdetailsbyOrganizationIdAndStatus(organizationId, status);
	}
	
	
	@PutMapping("/policy/updatepolicydetails/{policyId}")
	public ResponseEntity<Object> updatePolicyCreation(@PathVariable long policyId, @RequestBody PolicyCreation input) {
		PolicyCreation policy = mapper.map(input, PolicyCreation.class);

		Map<String, Object> out = policyService.updatePolicyCreation(policyId, policy);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}
	
	
	@PutMapping("/policy/convertToPolicy/{policyId}")
	public ResponseInfo convertToPolicy(@PathVariable long policyId, @RequestBody PolicyCreation input) {
		PolicyCreation policy = mapper.map(input, PolicyCreation.class);
		
		ResponseInfo out =policyService.convertToPolicy(policyId, policy);
		return out;
   }

	 
	@DeleteMapping("/policy/deletepolicydetails/{policyId}")
	public ResponseEntity<Object> deletePolicyCreation(@PathVariable long policyId) {

		Map<String, Object> out = policyService.deletePolicyCreation(policyId);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}
	
	@GetMapping("/policy/generateOrganizationUniqueCodeforPolicy")
	public  Map<String, Object> generateOrganizationUniqueCode(){
		return policyService.generateOrganizationUniqueCode();
	}
	
}
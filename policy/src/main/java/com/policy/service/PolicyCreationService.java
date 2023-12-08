package com.policy.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policy.model.PolicyCreation;
import com.policy.model.QuotationCreation;
import com.policy.repository.PolicyCreationRepository;
import com.policy.util.ResponseInfo;
import com.policy.util.ResponseInfo.ResponseType;

@Service
public class PolicyCreationService {

	@Autowired
	private PolicyCreationRepository policyRepository;
	
	public Map<String, Object> savePolicyCreation(PolicyCreation policy){
		Map<String, Object> out = new LinkedHashMap<>();
		policyRepository.save(policy);
		out.put("quoteId", policy.getPolicyId());
		out.put("message", "Quotation saved successfully");
		return out;
	}
	
	public List<PolicyCreation> findAllPolicyCreation(){
		return policyRepository.findAll();
	}
	
	public List<PolicyCreation> getpolicydetailsbyOrganizationId(long organizationId) {
		if(organizationId == 0) {
			return policyRepository.findAll();
		}else {
			return policyRepository.findByOrganizationId(organizationId);	
		}
		
	}
	
//	public List<PolicyCreation> getdetailsbyOrganizationIdAndStatus(long organizationId, int status){
//		return policyRepository.findByOrganizationIdAndStatus(organizationId, status);
//	}
	
	public List<Map<String, Object>> getdetailsbyOrganizationIdAndStatus(long organizationId, int status){
		Iterable<PolicyCreation> entities =policyRepository.findByOrganizationIdAndStatus(organizationId, status);
		List<Map<String, Object>> mappedEntities = StreamSupport.stream(entities.spliterator(), false)
                .map(entity -> {
                    Map<String, Object> entityMap = Map.of(
                            "policyId", entity.getPolicyId(),
                            "quotationCustomer", entity.getQuotationCustomer().getFirstName(),
                            "quotationInsurer", entity.getQuotationInsurer().getFirstName(),
                            "SumAssured", entity.getSumAssured(),
                            "agent", entity.getAgent(),
                            "uniqueCode", entity.getUniqueCode()
                            // Add other properties as needed
                    );
                    return entityMap;
                })
                .collect(Collectors.toList());
		System.out.println(mappedEntities);
		return mappedEntities;
	
	}
	
	
	public PolicyCreation findPolicyCreationByPolicyId(long policyId){
		return policyRepository.findById(policyId).get();
		
	}
	
	public Map<String, Object> updatePolicyCreation(long policyId,PolicyCreation policy) {
		Map<String, Object> out = new LinkedHashMap<>();
		policyRepository.save(policy);
		out.put("message", "PolicyCreation updated Successfully");
		return out;
	}

	public ResponseInfo convertToPolicy(long policyId,PolicyCreation input) {
		Map<String, Object> out = new LinkedHashMap<>();
		Optional<PolicyCreation> status = policyRepository.findById(policyId);
		PolicyCreation statusexist = status.get();
		if (status.isPresent()) {
//		if (statusexist.getStatus()) {
			statusexist.setStatus(input.getStatus());
			policyRepository.save(statusexist);
			out.put("messsage", "Policy converted Successfully !");
		}
		return new ResponseInfo(ResponseType.SUCCESS,out);
	}

	public Map<String, Object> deletePolicyCreation(long policyId) {
		Map<String, Object> out = new LinkedHashMap<>();
		policyRepository.deleteById(policyId);
		out.put("message", "PolicyCreation deleted Successfully");
		return out;
	} 
	
public Map<String, Object> generateOrganizationUniqueCode() {
		
		String formattedId =String.format("PO-%05d", policyRepository.count()+1);
		 Map<String, Object> out = new LinkedHashMap<>();
	     
	     out.put("uniqueId", formattedId);
	   
	     return out;
			
		}

}
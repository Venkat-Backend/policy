package com.policy.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policy.model.QuotationInsurer;
import com.policy.repository.QuotationInsurerRepository;
import com.policy.util.ResponseInfo;
import com.policy.util.ResponseInfo.ResponseType;

@Service
public class QuotationInsurerService {
	
	@Autowired
	QuotationInsurerRepository quotationInsurerRepository;


	public ResponseInfo saveQuotationInsurer(QuotationInsurer quotationInsurer) {
		Map<String, Object> out = new LinkedHashMap<>();
		Optional<QuotationInsurer> insurance = quotationInsurerRepository.findByEmail(quotationInsurer.getEmail());
		if (insurance.isPresent()) {
			out.put("message", "QuotationInsurer email is already exist!");
			return new ResponseInfo(ResponseType.FAIL, out);
		} else {
			quotationInsurerRepository.save(quotationInsurer);
			out.put("message", "Insurer saved successfully");
			return new ResponseInfo(ResponseType.SUCCESS,out);
		}
	}
	
	public List<QuotationInsurer> findQuotationInsurerByOrganizationId(long organizationId){
		return quotationInsurerRepository.findQuotationInsurerByOrganizationId(organizationId);
	}
	
	public List<QuotationInsurer> findAllQuotationInsurer(){
		return quotationInsurerRepository.findAll();
	}
	
	public List<QuotationInsurer> getQuotationInsurerByFirstNameAndOrganizationId(String firstName,long organizaionId) {
		return quotationInsurerRepository.findByFirstNameContainingIgnoreCaseAndOrganizationId(firstName, organizaionId);
	}
	
	public QuotationInsurer getQuotationInsurerById(long quotationinsurerId){
		return quotationInsurerRepository.findById(quotationinsurerId).orElseThrow();
		
	}
	
	public Map<String, Object> updateQuotationInsurer(long quotationinsurerId,QuotationInsurer QuotationInsurer) {
		Map<String, Object> out = new LinkedHashMap<>();
		quotationInsurerRepository.save(QuotationInsurer);
		out.put("message", "QuotationInsurer updated Successfully");
		return out;
	}


	public Map<String, Object> deleteQuotationInsurer(long quotationinsurerId) {
		Map<String, Object> out = new LinkedHashMap<>();
		quotationInsurerRepository.deleteById(quotationinsurerId);
		out.put("message", "QuotationInsurer deleted Successfully");
		return out;
	} 
}

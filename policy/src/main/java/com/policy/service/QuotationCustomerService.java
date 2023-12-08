package com.policy.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policy.model.QuotationCustomer;
import com.policy.repository.QuotationCustomerRepository;
import com.policy.util.ResponseInfo;
import com.policy.util.ResponseInfo.ResponseType;


@Service
public class QuotationCustomerService {
	
	@Autowired
	private QuotationCustomerRepository quotationCustomerRepository;
	
	public ResponseInfo saveCustomer(QuotationCustomer quotationCustomer) {
		Map<String, Object> out = new LinkedHashMap<>();
		Optional<QuotationCustomer> creation = quotationCustomerRepository.findByEmail(quotationCustomer.getEmail());
		if(creation.isPresent()) {
			out.put("message", "Email is already exist!");
			return new ResponseInfo(ResponseType.FAIL,out);
		}else {
			quotationCustomerRepository.save(quotationCustomer);
			out.put("message", "customer saved successfully");
			return new ResponseInfo(ResponseType.SUCCESS,out);
		}
	}
	
	public List<QuotationCustomer> findByOrganizationId(long organizationId){
		return quotationCustomerRepository.findByOrganizationId(organizationId);
		
	}
	
	
	public List<QuotationCustomer> findAllCustomers(){
		return quotationCustomerRepository.findAll();
	}
	
	public List<QuotationCustomer> getCustomerByFirstNameAndOrganizationId(String firstName , long organizationId) {
		return quotationCustomerRepository.findByFirstNameContainingIgnoreCaseAndOrganizationId(firstName, organizationId);
	}
	
	public QuotationCustomer getCustomerById(long quotationcustomerId){
		return quotationCustomerRepository.findById(quotationcustomerId).orElseThrow();
		
	}
	
	public Map<String, Object> updateCustomer(long quotationcustomerId,QuotationCustomer creation) {
		Map<String, Object> out = new LinkedHashMap<>();
		quotationCustomerRepository.save(creation);
		out.put("message", "QuotationCustomer updated Successfully");
		return out;
	}


	public Map<String, Object> deleteCustomer(long quotationcustomerId) {
		Map<String, Object> out = new LinkedHashMap<>();
		quotationCustomerRepository.deleteById(quotationcustomerId);
		out.put("message", "QuotationCustomer deleted Successfully");
		return out;
	} 

}

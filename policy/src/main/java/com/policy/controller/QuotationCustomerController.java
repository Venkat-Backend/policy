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

import com.policy.model.QuotationCustomer;
import com.policy.service.QuotationCustomerService;
import com.policy.util.ResponseInfo;
import com.policy.util.ResponseInfo.ResponseType;


@RestController
public class QuotationCustomerController {
	
	@Autowired
	private QuotationCustomerService quotationCustomerService;
	ModelMapper mapper = new ModelMapper();
	ResponseEntity<Object> response = null;
	
	@PostMapping("/policy/quotation/savecustomer")
	public ResponseInfo saveCustomerCreation(@RequestBody QuotationCustomer input) {
		QuotationCustomer quotationCustomer = mapper.map(input, QuotationCustomer.class);

		ResponseInfo out = quotationCustomerService.saveCustomer(quotationCustomer);

		    return out;
	}
	
	@GetMapping("/policy/quotation/getcustomerbyorganizationid/{organizationId}")
	public List<QuotationCustomer> findByOrganizationId(@PathVariable long organizationId){
		return quotationCustomerService.findByOrganizationId(organizationId);
	}
	
	@GetMapping("/policy/quotation/getallcustomer")
	public List<QuotationCustomer> findAllCustomerCreation(){
		return quotationCustomerService. findAllCustomers();
	}
	
	@GetMapping("/policy/quotation/getcustomerbyfnameandorganizationid/{firstName}/{organizationId}")
	public List<QuotationCustomer> getCustomerCreationByFirstNameAndOrganizationId(@PathVariable String firstName , @PathVariable long organizationId) {
		return quotationCustomerService.getCustomerByFirstNameAndOrganizationId(firstName, organizationId);
	}
	
	@GetMapping("/policy/quotation/getcustomerbyid/{quotationcustomerId}")
	public QuotationCustomer getCustomerById(@PathVariable long quotationcustomerId) {
		return quotationCustomerService.getCustomerById(quotationcustomerId);
	}
	
	@PutMapping("/policy/quotation/updatecustomer/{quotationcustomerId}")
	public ResponseEntity<Object> updateCustomerCreation(@PathVariable long quotationcustomerId, @RequestBody QuotationCustomer input) {
		QuotationCustomer customer = mapper.map(input, QuotationCustomer.class);

		Map<String, Object> out = quotationCustomerService.updateCustomer(quotationcustomerId, customer);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}
	 
	@DeleteMapping("/policy/quotation/deletecustomer/{quotationcustomerId}")
	public ResponseEntity<Object> deleteCustomerCreation(@PathVariable long quotationcustomerId) {

		Map<String, Object> out = quotationCustomerService.deleteCustomer(quotationcustomerId);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}

}

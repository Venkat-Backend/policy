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

import com.policy.model.QuotationInsurer;
import com.policy.service.QuotationInsurerService;
import com.policy.util.ResponseInfo;
import com.policy.util.ResponseInfo.ResponseType;

@RestController
public class QuotationInsurerController {
	
	@Autowired
	private QuotationInsurerService quotationInsurerService;
	ModelMapper mapper = new ModelMapper();
	ResponseEntity<Object> response = null;
	
	@PostMapping("/policy/quotation/saveinsured")
	public ResponseInfo saveInsured(@RequestBody QuotationInsurer input) {
		QuotationInsurer quotationInsurer = mapper.map(input, QuotationInsurer.class);

		ResponseInfo out = quotationInsurerService.saveQuotationInsurer(quotationInsurer);
		    return out;
	}
	
	@GetMapping("/policy/quotation/getquotationinsurerbyorganizationid/{organizationId}")
	public List<QuotationInsurer> findByOrganizationId(@PathVariable long organizationId){
		return quotationInsurerService.findQuotationInsurerByOrganizationId(organizationId);
	}
	
	@GetMapping("/policy/quotation/getallquotationinsurer")
	public List<QuotationInsurer> findAllInsured(){
		return quotationInsurerService. findAllQuotationInsurer();
	}
	
	@GetMapping("/policy/quotation/getquotationinsurerbyfname/{firstName}/{organizationId}")
	public List<QuotationInsurer> getInsuredById(@PathVariable String firstName, @PathVariable long organizationId) {
		return quotationInsurerService.getQuotationInsurerByFirstNameAndOrganizationId(firstName, organizationId);
	}
	
	@GetMapping("/policy/quotation/getquotationinsurerbyid/{quotationinsurerId}")
	public QuotationInsurer getCustomerById(@PathVariable long quotationinsurerId) {
		return quotationInsurerService.getQuotationInsurerById(quotationinsurerId);
	}
	
	@PutMapping("/policy/quotation/updatequotationinsurer/{quotationinsurerId}")
	public ResponseEntity<Object> updateInsured(@PathVariable long quotationinsurerId, @RequestBody QuotationInsurer input) {
		QuotationInsurer insured = mapper.map(input, QuotationInsurer.class);

		Map<String, Object> out = quotationInsurerService.updateQuotationInsurer(quotationinsurerId, insured);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}
	 
	@DeleteMapping("/policy/quotation/deletequotationinsurer/{quotationinsurerId}")
	public ResponseEntity<Object> deleteInsured(@PathVariable long quotationinsurerId) {

		Map<String, Object> out = quotationInsurerService.deleteQuotationInsurer(quotationinsurerId);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}

}

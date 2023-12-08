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

import com.policy.model.QuotationCreation;
import com.policy.service.QuotationCreationService;
import com.policy.util.ResponseInfo;
import com.policy.util.ResponseInfo.ResponseType;

@RestController
public class QuotationCreationController {
	
	@Autowired
	private QuotationCreationService quotationCreationService;
	ModelMapper mapper = new ModelMapper();
	ResponseEntity<Object> response = null;

	@PostMapping("/policy/quotation/savequotationCreationdetails")
	public ResponseEntity<Object> saveQuotationCreation(@RequestBody QuotationCreation input) {
		QuotationCreation quotationCreation = mapper.map(input, QuotationCreation.class);

		Map<String, Object> out = quotationCreationService.saveQuotationCreation(quotationCreation);
		 response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);
		    return response;
	}
	
	
	@GetMapping("/policy/quotation/getallquotationCreationdetails")
	public List<QuotationCreation> findAllQuotationCreation(){
		return quotationCreationService.findAllQuotationCreation();
	}
	
	@GetMapping("/policy/quotation/getquotationCreationdetailsbyid/{quotationId}")
	public QuotationCreation getCustomerById(@PathVariable long quotationId) {
		return quotationCreationService.findQuotationCreationByquotationCreationId(quotationId);
	}
	
	@GetMapping("/policy/quotation/getquotationCreationdetailsbyOrganizationId/{organizationId}")
	public List<QuotationCreation> getquotationCreationdetailsbyOrganizationId(@PathVariable long organizationId) {
		return quotationCreationService.getquotationCreationdetailsbyOrganizationId(organizationId);
	}
	
	@GetMapping("/policy/quotation/getquotationCreationdetailsByOrganizationIdAndStatus/{organizationId}/{status}")
	public List<Map<String, Object>> getdetailsbyOrganizationIdAndStatus(@PathVariable long organizationId, @PathVariable int status) {
		return quotationCreationService.getdetailsbyOrganizationIdAndStatus(organizationId, status);
	}
	
	
	@PutMapping("/policy/quotation/updatequotationCreationdetails/{quotationId}")
	public ResponseEntity<Object> updateQuotationCreation(@PathVariable long quotationId, @RequestBody QuotationCreation input) {
		QuotationCreation quotationCreation = mapper.map(input, QuotationCreation.class);

		Map<String, Object> out = quotationCreationService.updateQuotationCreation(quotationId, quotationCreation);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}
	
	
	@PutMapping("/policy/quotation/convertToquotationCreation/{quotationId}")
	public ResponseInfo convertToquotationCreation(@PathVariable long quotationId, @RequestBody QuotationCreation input) {
		QuotationCreation quotationCreation = mapper.map(input, QuotationCreation.class);
		
		ResponseInfo out =quotationCreationService.convertToquotationCreation(quotationId, quotationCreation);
		return out;
   }

	 
	@DeleteMapping("/policy/quotation/deletequotationCreationdetails/{quotationId}")
	public ResponseEntity<Object> deleteQuotationCreation(@PathVariable long quotationId) {

		Map<String, Object> out = quotationCreationService.deleteQuotationCreation(quotationId);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}
	
	@GetMapping("/policy/quotation/generateOrganizationUniqueCodeforquotationCreation")
	public  Map<String, Object> generateOrganizationUniqueCode(){
		return quotationCreationService.generateOrganizationUniqueCode();
	}

}

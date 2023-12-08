package com.policy.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policy.model.QuotationCreation;
import com.policy.repository.QuotationCreationRepository;
import com.policy.util.ResponseInfo;
import com.policy.util.ResponseInfo.ResponseType;

@Service
public class QuotationCreationService {
	
	@Autowired
	private QuotationCreationRepository quotationCreationRepository;
	
	public Map<String, Object> saveQuotationCreation(QuotationCreation quotationCreation){
		Map<String, Object> out = new LinkedHashMap<>();
		quotationCreationRepository.save(quotationCreation);
		out.put("quoteId", quotationCreation.getQuotationId());
		out.put("message", "Quotation saved successfully");
		return out;
	}
	
	public List<QuotationCreation> findAllQuotationCreation(){
		return quotationCreationRepository.findAll();
	}
	
	public List<QuotationCreation> getquotationCreationdetailsbyOrganizationId(long organizationId) {
		if(organizationId == 0) {
			return quotationCreationRepository.findAll();
		}else {
			return quotationCreationRepository.findByOrganizationId(organizationId);	
		}
		
	}
	
	public List<Map<String, Object>> getdetailsbyOrganizationIdAndStatus(long organizationId, int status){
		Iterable<QuotationCreation> entities =quotationCreationRepository.findByOrganizationIdAndStatus(organizationId, status);
		List<Map<String, Object>> mappedEntities = StreamSupport.stream(entities.spliterator(), false)
                .map(entity -> {
                    Map<String, Object> entityMap = Map.of(
                            "quotationId", entity.getQuotationId(),
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
	
	public QuotationCreation findQuotationCreationByquotationCreationId(long quotationId){
		return quotationCreationRepository.findById(quotationId).get();
		
	}
	
	public Map<String, Object> updateQuotationCreation(long quotationId,QuotationCreation quotationCreation) {
		Map<String, Object> out = new LinkedHashMap<>();
		quotationCreationRepository.save(quotationCreation);
		out.put("message", "QuotationCreation updated Successfully");
		return out;
	}

	public ResponseInfo convertToquotationCreation(long quotationId,QuotationCreation input) {
		Map<String, Object> out = new LinkedHashMap<>();
		Optional<QuotationCreation> status = quotationCreationRepository.findById(quotationId);
		QuotationCreation statusexist = status.get();
		if (status.isPresent()) {
//		if (statusexist.getStatus()) {
			statusexist.setStatus(input.getStatus());
			quotationCreationRepository.save(statusexist);
			out.put("messsage", "quotationCreation converted Successfully !");
		}
		return new ResponseInfo(ResponseType.SUCCESS,out);
	}

	public Map<String, Object> deleteQuotationCreation(long quotationId) {
		Map<String, Object> out = new LinkedHashMap<>();
		quotationCreationRepository.deleteById(quotationId);
		out.put("message", "QuotationCreation deleted Successfully");
		return out;
	} 
	
public Map<String, Object> generateOrganizationUniqueCode() {
		
		String formattedId =String.format("QU-%05d", quotationCreationRepository.count()+1);
		 Map<String, Object> out = new LinkedHashMap<>();
	     
	     out.put("uniqueId", formattedId);
	   
	     return out;
			
		}

}

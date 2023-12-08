//package com.policy.controller;
//
//import java.util.Map;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.policy.model.PolicyAllocationTotal;
//import com.policy.service.PolicyAllocationTotalService;
//import com.policy.util.ResponseInfo;
//import com.policy.util.ResponseInfo.ResponseType;
//
//@RestController
//public class PolicyAllocationTotalController {
//	
//	@Autowired
//	private PolicyAllocationTotalService allocationTotalService;
//	ModelMapper mapper = new ModelMapper();
//	ResponseEntity<Object> response = null;
//	
//	@PostMapping("/policy/savepolicyallocationtotal")
//	public ResponseEntity<Object> savePolicyAllocationTotal(@RequestBody PolicyAllocationTotal allocationTotal){
//		PolicyAllocationTotal policyAllocationTotal = mapper.map(allocationTotal, PolicyAllocationTotal.class);
//		
//		Map<String, Object> out = allocationTotalService.savePolicyAllocationTotal(policyAllocationTotal);
//		response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS,out),HttpStatus.OK);
//		
//		return response;
//	}
//
//}

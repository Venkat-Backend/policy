//package com.policy.model;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "totalPolicyAllocation")
//public class PolicyAllocationTotal {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long totalPolicyAllocationId;
//	
//	private long totalRiskSumAssured;
//	
//	private long totalRiskPml;
//	
//	private long totalRiskPrem;
//	
//	private long totalAllocSi;
//	
//	private long totalAllocPml;
//	
//	private long totalAllocPremium;
//	
//	private String treatyCode;
//	
//	private String addlCessionSi;
//	
//	private String treatyYear;
//	
//	private String addCessionPml;
//	
//	private String treatyTypeCodeDesc;
//	
//	private String addlCessionPremium;
//	
//	    @ManyToOne(cascade = CascadeType.MERGE ,fetch = FetchType.EAGER)
//		@JoinColumn(name = "policy_allocation_id" ,referencedColumnName = "policyAllocationId")
//		private PolicyAllocationDetails policyConversionBasicDetails;
//
//		public long getTotalPolicyAllocationId() {
//			return totalPolicyAllocationId;
//		}
//
//		public void setTotalPolicyAllocationId(long totalPolicyAllocationId) {
//			this.totalPolicyAllocationId = totalPolicyAllocationId;
//		}
//
//		public long getTotalRiskSumAssured() {
//			return totalRiskSumAssured;
//		}
//
//		public void setTotalRiskSumAssured(long totalRiskSumAssured) {
//			this.totalRiskSumAssured = totalRiskSumAssured;
//		}
//
//		public long getTotalRiskPml() {
//			return totalRiskPml;
//		}
//
//		public void setTotalRiskPml(long totalRiskPml) {
//			this.totalRiskPml = totalRiskPml;
//		}
//
//		public long getTotalRiskPrem() {
//			return totalRiskPrem;
//		}
//
//		public void setTotalRiskPrem(long totalRiskPrem) {
//			this.totalRiskPrem = totalRiskPrem;
//		}
//
//		public long getTotalAllocSi() {
//			return totalAllocSi;
//		}
//
//		public void setTotalAllocSi(long totalAllocSi) {
//			this.totalAllocSi = totalAllocSi;
//		}
//
//		public long getTotalAllocPml() {
//			return totalAllocPml;
//		}
//
//		public void setTotalAllocPml(long totalAllocPml) {
//			this.totalAllocPml = totalAllocPml;
//		}
//
//		public long getTotalAllocPremium() {
//			return totalAllocPremium;
//		}
//
//		public void setTotalAllocPremium(long totalAllocPremium) {
//			this.totalAllocPremium = totalAllocPremium;
//		}
//
//		public String getTreatyCode() {
//			return treatyCode;
//		}
//
//		public void setTreatyCode(String treatyCode) {
//			this.treatyCode = treatyCode;
//		}
//
//		public String getAddlCessionSi() {
//			return addlCessionSi;
//		}
//
//		public void setAddlCessionSi(String addlCessionSi) {
//			this.addlCessionSi = addlCessionSi;
//		}
//
//		public String getTreatyYear() {
//			return treatyYear;
//		}
//
//		public void setTreatyYear(String treatyYear) {
//			this.treatyYear = treatyYear;
//		}
//
//		public String getAddCessionPml() {
//			return addCessionPml;
//		}
//
//		public void setAddCessionPml(String addCessionPml) {
//			this.addCessionPml = addCessionPml;
//		}
//
//		public String getTreatyTypeCodeDesc() {
//			return treatyTypeCodeDesc;
//		}
//
//		public void setTreatyTypeCodeDesc(String treatyTypeCodeDesc) {
//			this.treatyTypeCodeDesc = treatyTypeCodeDesc;
//		}
//
//		public String getAddlCessionPremium() {
//			return addlCessionPremium;
//		}
//
//		public void setAddlCessionPremium(String addlCessionPremium) {
//			this.addlCessionPremium = addlCessionPremium;
//		}
//
//		public PolicyAllocationDetails getPolicyConversionBasicDetails() {
//			return policyConversionBasicDetails;
//		}
//
//		public void setPolicyConversionBasicDetails(PolicyAllocationDetails policyConversionBasicDetails) {
//			this.policyConversionBasicDetails = policyConversionBasicDetails;
//		}
//
//	
//	
//}

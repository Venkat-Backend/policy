package com.policy.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "policyConversionBasicDetails")
public class PolicyAllocationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long policyAllocationId;

	private Date riConfirmedDate;

	private String confirmedBy;

	private String office;

	private String department;

	private String businesstype;

	private long customerCode;
	
	private Date startDate;

	private Date endDate;

	private long riPremiumNumber;

	private Date product;

	private Date txnDate;
	
	private String policyNo;
	
private long totalRiskSumAssured;
	
	private long totalRiskPml;
	
	private long totalRiskPrem;
	
	private long totalAllocSi;
	
	private long totalAllocPml;
	
	private long totalAllocPremium;
	
	private String treatyCode;
	
	private String addlCessionSi;
	
	private String treatyYear;
	
	private String addCessionPml;
	
	private String treatyTypeCodeDesc;
	
	private String addlCessionPremium;
	
	private long totalSplRetnSi;
	
	private long totalSplRetnPml;
	
	private long totalSplRetnPrem;
	
	@CreationTimestamp
	private Date createdAt; 

	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "policy_id")
	private PolicyCreation policyQuotation;
	
//	@OneToMany(targetEntity = PolicyAllocationTotal.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "policyAllocationId",referencedColumnName = "policyAllocationId")
//	private PolicyAllocationTotal totalPolicyAllocation;
	
//	  @OneToMany(fetch = FetchType.EAGER, mappedBy = "policyConversionBasicDetails", cascade = CascadeType.ALL)
//		@JsonIgnoreProperties("policyConversionBasicDetails")
//		private Set<PolicyAllocationTotal> totalPolicyAllocation;

	@OneToMany(targetEntity = PolicyRiskDetails.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "policyAllocationId",referencedColumnName = "policyAllocationId")
	private List<PolicyRiskDetails> policyRiskGroupDetails;
	
	@OneToMany(targetEntity = PolicyTreatyAllocation.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "policyAllocationId",referencedColumnName = "policyAllocationId")
	private List<PolicyTreatyAllocation> policyTreatyAllocation;

	public long getPolicyAllocationId() {
		return policyAllocationId;
	}

	public Date getRiConfirmedDate() {
		return riConfirmedDate;
	}

	public String getConfirmedBy() {
		return confirmedBy;
	}

	public String getOffice() {
		return office;
	}

	public String getDepartment() {
		return department;
	}

	public String getBusinesstype() {
		return businesstype;
	}

	public long getCustomerCode() {
		return customerCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public long getRiPremiumNumber() {
		return riPremiumNumber;
	}

	public Date getProduct() {
		return product;
	}

	public Date getTxnDate() {
		return txnDate;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public long getTotalRiskSumAssured() {
		return totalRiskSumAssured;
	}

	public long getTotalRiskPml() {
		return totalRiskPml;
	}

	public long getTotalRiskPrem() {
		return totalRiskPrem;
	}

	public long getTotalAllocSi() {
		return totalAllocSi;
	}

	public long getTotalAllocPml() {
		return totalAllocPml;
	}

	public long getTotalAllocPremium() {
		return totalAllocPremium;
	}

	public String getTreatyCode() {
		return treatyCode;
	}

	public String getAddlCessionSi() {
		return addlCessionSi;
	}

	public String getTreatyYear() {
		return treatyYear;
	}

	public String getAddCessionPml() {
		return addCessionPml;
	}

	public String getTreatyTypeCodeDesc() {
		return treatyTypeCodeDesc;
	}

	public String getAddlCessionPremium() {
		return addlCessionPremium;
	}

	public long getTotalSplRetnSi() {
		return totalSplRetnSi;
	}

	public long getTotalSplRetnPml() {
		return totalSplRetnPml;
	}

	public long getTotalSplRetnPrem() {
		return totalSplRetnPrem;
	}

	public PolicyCreation getPolicyQuotation() {
		return policyQuotation;
	}

	public List<PolicyRiskDetails> getPolicyRiskGroupDetails() {
		return policyRiskGroupDetails;
	}

	public List<PolicyTreatyAllocation> getPolicyTreatyAllocation() {
		return policyTreatyAllocation;
	}

	public void setPolicyAllocationId(long policyAllocationId) {
		this.policyAllocationId = policyAllocationId;
	}

	public void setRiConfirmedDate(Date riConfirmedDate) {
		this.riConfirmedDate = riConfirmedDate;
	}

	public void setConfirmedBy(String confirmedBy) {
		this.confirmedBy = confirmedBy;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setBusinesstype(String businesstype) {
		this.businesstype = businesstype;
	}

	public void setCustomerCode(long customerCode) {
		this.customerCode = customerCode;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setRiPremiumNumber(long riPremiumNumber) {
		this.riPremiumNumber = riPremiumNumber;
	}

	public void setProduct(Date product) {
		this.product = product;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public void setTotalRiskSumAssured(long totalRiskSumAssured) {
		this.totalRiskSumAssured = totalRiskSumAssured;
	}

	public void setTotalRiskPml(long totalRiskPml) {
		this.totalRiskPml = totalRiskPml;
	}

	public void setTotalRiskPrem(long totalRiskPrem) {
		this.totalRiskPrem = totalRiskPrem;
	}

	public void setTotalAllocSi(long totalAllocSi) {
		this.totalAllocSi = totalAllocSi;
	}

	public void setTotalAllocPml(long totalAllocPml) {
		this.totalAllocPml = totalAllocPml;
	}

	public void setTotalAllocPremium(long totalAllocPremium) {
		this.totalAllocPremium = totalAllocPremium;
	}

	public void setTreatyCode(String treatyCode) {
		this.treatyCode = treatyCode;
	}

	public void setAddlCessionSi(String addlCessionSi) {
		this.addlCessionSi = addlCessionSi;
	}

	public void setTreatyYear(String treatyYear) {
		this.treatyYear = treatyYear;
	}

	public void setAddCessionPml(String addCessionPml) {
		this.addCessionPml = addCessionPml;
	}

	public void setTreatyTypeCodeDesc(String treatyTypeCodeDesc) {
		this.treatyTypeCodeDesc = treatyTypeCodeDesc;
	}

	public void setAddlCessionPremium(String addlCessionPremium) {
		this.addlCessionPremium = addlCessionPremium;
	}

	public void setTotalSplRetnSi(long totalSplRetnSi) {
		this.totalSplRetnSi = totalSplRetnSi;
	}

	public void setTotalSplRetnPml(long totalSplRetnPml) {
		this.totalSplRetnPml = totalSplRetnPml;
	}

	public void setTotalSplRetnPrem(long totalSplRetnPrem) {
		this.totalSplRetnPrem = totalSplRetnPrem;
	}

	public void setPolicyQuotation(PolicyCreation policyQuotation) {
		this.policyQuotation = policyQuotation;
	}

	public void setPolicyRiskGroupDetails(List<PolicyRiskDetails> policyRiskGroupDetails) {
		this.policyRiskGroupDetails = policyRiskGroupDetails;
	}

	public void setPolicyTreatyAllocation(List<PolicyTreatyAllocation> policyTreatyAllocation) {
		this.policyTreatyAllocation = policyTreatyAllocation;
	}

	
	
}

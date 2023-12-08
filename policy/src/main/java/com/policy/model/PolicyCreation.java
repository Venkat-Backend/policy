package com.policy.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "policyQuotation")
public class PolicyCreation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long policyId;
	
	private long productId;
	
	private long lobId;
	
	private Date policyStartDate;
	
	private Date policyEndDate;
	
	private String period;
	
	private String sourceType;
	
	private String agent;
	
	private long sumAssured;
	
	private int status;
	
	private long organizationId;
	
	private String uniqueCode;
	
	@CreationTimestamp
	private Date createdAt;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quotation_id")
	private QuotationCreation quotation;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quotationcustomer_id")
	private QuotationCustomer quotationCustomer;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quotationinsurer_id")
	private QuotationInsurer quotationInsurer;

	
//	@ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "customer_id")
//	private CustomerCreation customerCreation;
//	
//	@ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "insured_id")
//	private Insured insured;

	@OneToMany(targetEntity = PolicyAddOnCovers.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "policyId",referencedColumnName = "policyId")
	private List<PolicyAddOnCovers> addOnCovers;
	
	@OneToMany(targetEntity = PolicyDiscounts.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "policyId",referencedColumnName = "policyId")
	private List<PolicyDiscounts> policyDiscounts;
	
//	@OneToMany(targetEntity = PolicyProductDetails.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "pp_fk",referencedColumnName = "policyId")
//	private List<PolicyProductDetails> policyProductDetails;

	@OneToMany(targetEntity = PolicyPlan.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "policyId",referencedColumnName = "policyId")
	private List<PolicyPlan> policyplanFields;

	public long getPolicyId() {
		return policyId;
	}

	public long getProductId() {
		return productId;
	}

	public long getLobId() {
		return lobId;
	}

	public Date getPolicyStartDate() {
		return policyStartDate;
	}

	public Date getPolicyEndDate() {
		return policyEndDate;
	}

	public String getPeriod() {
		return period;
	}

	public String getSourceType() {
		return sourceType;
	}

	public String getAgent() {
		return agent;
	}

	public long getSumAssured() {
		return sumAssured;
	}

	public int getStatus() {
		return status;
	}

	public long getOrganizationId() {
		return organizationId;
	}

	public String getUniqueCode() {
		return uniqueCode;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public QuotationCreation getQuotation() {
		return quotation;
	}

	public QuotationCustomer getQuotationCustomer() {
		return quotationCustomer;
	}

	public QuotationInsurer getQuotationInsurer() {
		return quotationInsurer;
	}

	public List<PolicyAddOnCovers> getAddOnCovers() {
		return addOnCovers;
	}

	public List<PolicyDiscounts> getPolicyDiscounts() {
		return policyDiscounts;
	}

	public List<PolicyPlan> getPolicyplanFields() {
		return policyplanFields;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public void setLobId(long lobId) {
		this.lobId = lobId;
	}

	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public void setSumAssured(long sumAssured) {
		this.sumAssured = sumAssured;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setQuotation(QuotationCreation quotation) {
		this.quotation = quotation;
	}

	public void setQuotationCustomer(QuotationCustomer quotationCustomer) {
		this.quotationCustomer = quotationCustomer;
	}

	public void setQuotationInsurer(QuotationInsurer quotationInsurer) {
		this.quotationInsurer = quotationInsurer;
	}

	public void setAddOnCovers(List<PolicyAddOnCovers> addOnCovers) {
		this.addOnCovers = addOnCovers;
	}

	public void setPolicyDiscounts(List<PolicyDiscounts> policyDiscounts) {
		this.policyDiscounts = policyDiscounts;
	}

	public void setPolicyplanFields(List<PolicyPlan> policyplanFields) {
		this.policyplanFields = policyplanFields;
	}

	
//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "policyCreation",cascade = CascadeType.ALL)
//	@JsonIgnoreProperties("policyCreation")
//	private Set<AddOnCovers> addOnCovers;
	
	 
}

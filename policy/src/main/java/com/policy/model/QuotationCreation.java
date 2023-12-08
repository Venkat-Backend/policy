package com.policy.model;

import java.sql.Date;
import java.util.List;

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



@Entity
@Table(name = "quotation")
public class QuotationCreation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long quotationId;

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
    @JoinColumn(name = "quotationcustomer_id")
	private QuotationCustomer quotationCustomer;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quotationinsurer_id")
	private QuotationInsurer quotationInsurer;

	@OneToMany(targetEntity = QuotationAddOnCovers.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "quotationId",referencedColumnName = "quotationId")
	private List<QuotationAddOnCovers> quotationAddOnCovers;
	
	@OneToMany(targetEntity = QuotationDiscount.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "quotationId",referencedColumnName = "quotationId")
	private List<QuotationDiscount> quotationDiscounts;
	
	@OneToMany(targetEntity = QuotationPlan.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "quotationId",referencedColumnName = "quotationId")
	private List<QuotationPlan> quotationPlans;

	public long getQuotationId() {
		return quotationId;
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

	public QuotationCustomer getQuotationCustomer() {
		return quotationCustomer;
	}

	public QuotationInsurer getQuotationInsurer() {
		return quotationInsurer;
	}

	public List<QuotationAddOnCovers> getQuotationAddOnCovers() {
		return quotationAddOnCovers;
	}

	public List<QuotationDiscount> getQuotationDiscounts() {
		return quotationDiscounts;
	}

	public List<QuotationPlan> getQuotationPlans() {
		return quotationPlans;
	}

	public void setQuotationId(long quotationId) {
		this.quotationId = quotationId;
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

	public void setQuotationCustomer(QuotationCustomer quotationCustomer) {
		this.quotationCustomer = quotationCustomer;
	}

	public void setQuotationInsurer(QuotationInsurer quotationInsurer) {
		this.quotationInsurer = quotationInsurer;
	}

	public void setQuotationAddOnCovers(List<QuotationAddOnCovers> quotationAddOnCovers) {
		this.quotationAddOnCovers = quotationAddOnCovers;
	}

	public void setQuotationDiscounts(List<QuotationDiscount> quotationDiscounts) {
		this.quotationDiscounts = quotationDiscounts;
	}

	public void setQuotationPlans(List<QuotationPlan> quotationPlans) {
		this.quotationPlans = quotationPlans;
	}

	
	
	
}

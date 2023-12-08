package com.policy.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "quotationAddOnCovers")
public class QuotationAddOnCovers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long quotationaddId;
	
	private long addId;
	
	private String benefits;
	
	private long sumAssured;
	
	private int rate;
	
	private int premium;
	
	private long organizationId;
	
	@CreationTimestamp
	private Date createdAt;

	public long getQuotationaddId() {
		return quotationaddId;
	}

	public long getAddId() {
		return addId;
	}

	public String getBenefits() {
		return benefits;
	}

	public long getSumAssured() {
		return sumAssured;
	}

	public int getRate() {
		return rate;
	}

	public int getPremium() {
		return premium;
	}

	public long getOrganizationId() {
		return organizationId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setQuotationaddId(long quotationaddId) {
		this.quotationaddId = quotationaddId;
	}

	public void setAddId(long addId) {
		this.addId = addId;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public void setSumAssured(long sumAssured) {
		this.sumAssured = sumAssured;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	 

}

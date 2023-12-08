package com.policy.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "quotationDiscount")
public class QuotationDiscount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long quotationDiscountId;
	
	private long discountId;
	
    private String covers;
	
	private String coverType;
	
	private String rate;
	
	private String premium;
	
	private long sumAssured;
	
	private long organizationId;

	@CreationTimestamp
	private Date createdAt;

	public long getQuotationDiscountId() {
		return quotationDiscountId;
	}

	public long getDiscountId() {
		return discountId;
	}

	public String getCovers() {
		return covers;
	}

	public String getCoverType() {
		return coverType;
	}

	public String getRate() {
		return rate;
	}

	public String getPremium() {
		return premium;
	}

	public long getSumAssured() {
		return sumAssured;
	}

	public long getOrganizationId() {
		return organizationId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setQuotationDiscountId(long quotationDiscountId) {
		this.quotationDiscountId = quotationDiscountId;
	}

	public void setDiscountId(long discountId) {
		this.discountId = discountId;
	}

	public void setCovers(String covers) {
		this.covers = covers;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public void setSumAssured(long sumAssured) {
		this.sumAssured = sumAssured;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	
}

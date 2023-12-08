package com.policy.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "quotationPlan")
public class QuotationPlan {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long quotationplanId;
	
	  @Column(columnDefinition = "TEXT")
	    private String quotationFormData;
	  
	  @CreationTimestamp
		private Date createdAt;

	public long getQuotationplanId() {
		return quotationplanId;
	}

	public String getQuotationFormData() {
		return quotationFormData;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setQuotationplanId(long quotationplanId) {
		this.quotationplanId = quotationplanId;
	}

	public void setQuotationFormData(String quotationFormData) {
		this.quotationFormData = quotationFormData;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	  
}

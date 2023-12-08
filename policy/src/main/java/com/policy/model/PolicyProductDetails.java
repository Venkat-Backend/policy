package com.policy.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "policyProductDetails")
public class PolicyProductDetails {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private long policyProductId;
	
	private long formId;
	
	private String formTitle;
	
	private String formValue;
	
	@CreationTimestamp
	private Date createdAt;

	public long getPolicyProductId() {
		return policyProductId;
	}

	public void setPolicyProductId(long policyProductId) {
		this.policyProductId = policyProductId;
	}

	public long getFormId() {
		return formId;
	}

	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getFormTitle() {
		return formTitle;
	}

	public void setFormTitle(String formTitle) {
		this.formTitle = formTitle;
	}

	public String getFormValue() {
		return formValue;
	}

	public void setFormValue(String formValue) {
		this.formValue = formValue;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	
	
}

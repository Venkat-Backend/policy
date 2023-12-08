package com.policy.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "policyplanFields")
public class PolicyPlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long policyplanId;
	
	  @Column(columnDefinition = "TEXT")
	    private String policyFormData;
	  
	  @CreationTimestamp
		private Date createdAt;

	public long getPolicyplanId() {
		return policyplanId;
	}

	public void setPolicyplanId(long policyplanId) {
		this.policyplanId = policyplanId;
	}

	public String getPolicyFormData() {
		return policyFormData;
	}

	public void setPolicyFormData(String policyFormData) {
		this.policyFormData = policyFormData;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	
}

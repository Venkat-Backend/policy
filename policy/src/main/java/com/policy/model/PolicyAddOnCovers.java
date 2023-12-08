package com.policy.model;

import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name = "policyAddOnCovers")
public class PolicyAddOnCovers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long policyaddId;
	
	private long addId;
	
	private String benefits;
	
	private long sumAssured;
	
	private int rate;
	
	private int premium;
	
	private long organizationId;
	
	@CreationTimestamp
	private Date createdAt;

	public long getPolicyaddId() {
		return policyaddId;
	}

	public void setPolicyaddId(long policyaddId) {
		this.policyaddId = policyaddId;
	}

	public long getAddId() {
		return addId;
	}

	public void setAddId(long addId) {
		this.addId = addId;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public long getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(long sumAssured) {
		this.sumAssured = sumAssured;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	public long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	
	
//	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
//	@JoinColumn(name = "policy_id" , referencedColumnName = "policyId")
//	private PolicyCreation policyCreation;
	
	
}
